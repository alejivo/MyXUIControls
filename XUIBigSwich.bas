B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
#DesignerProperty: Key: Padding, DisplayName: Padding, FieldType: Int, DefaultValue: 1, Description: Space between content and the border.
#DesignerProperty: Key: AutoResize, DisplayName: Auto Resize, FieldType: Boolean, DefaultValue: False, Description: When this option is checked the button autoresizes the label.
#DesignerProperty: Key: TextAligment, DisplayName:  Text Aligment, FieldType: String, DefaultValue: CENTER, List: LEFT|CENTER|RIGHT
#DesignerProperty: Key: , DisplayName: Auto Resize, FieldType: Boolean, DefaultValue: False, Description: When this option is checked the button autoresizes the label.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private mLbl As Label
	Private lblAutoresize As B4XView
	Private xui As XUI 'ignore
	Private vPadding As Int
	Private vAutoResize As Boolean
	Private vTextAligment As String
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	mLbl = Lbl
	LoadProps(Props)
	AutoResizeLabel
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	mBase.RemoveAllViews
	AutoResizeLabel
End Sub

'This function create a label add it to the view and call the the autoresize function
Private Sub AutoResizeLabel
	lblAutoresize = CreateLabel("lblAutoresize", mLbl)
	lblAutoresize.Height = mBase.Height-(vPadding*2)
	lblAutoresize.Width = mBase.Width-(vPadding*2)
	lblAutoresize.SetTextAlignment("CENTER", vTextAligment)
	mBase.AddView(lblAutoresize,vPadding,vPadding,lblAutoresize.Width,lblAutoresize.Height)
	If vAutoResize Then AutoResize
End Sub

'load all propertys
Private Sub LoadProps(Props As Map)
	vTextAligment = Props.Get("TextAligment")
	vAutoResize = Props.Get("AutoResize")
	vPadding = Props.Get("Padding")
End Sub

#Region Resize Label

'This function is based on Erel's code: https://www.b4x.com/android/forum/threads/custom-view-autotextsizelabel.30642/#post-177986
Private Sub AutoResize
	Dim multipleLines As Boolean = lblAutoresize.Text.Contains(CRLF)
	Dim size As Float
	For size = 2 To 80
		If CheckSize(size, multipleLines) Then Exit
	Next
	size = size - 0.5
	If CheckSize(size, multipleLines) Then size = size - 0.5
	lblAutoresize.TextSize = size
End Sub

'returns true if the size is too large
Private Sub CheckSize(size As Float, multipleLines As Boolean) As Boolean
	lblAutoresize.TextSize = size
	If multipleLines Then
		#If B4A
		Dim su As StringUtils
		Return su.MeasureMultilineTextHeight(lblAutoresize,lblAutoresize.Text) > lblAutoresize.Height
		#Else if B4I
			Dim tmplbl As Label = lblAutoresize
			tmplbl.Multiline = True
			lblAutoresize = tmplbl
		'Return MeasureTextHeight(lblAutoresize.Text,lblAutoresize.Font) > lblAutoresize.Height
			Return getTextHeight(lblAutoresize.Text,lblAutoresize.Font,lblAutoresize.Width) > lblAutoresize.Height
		#Else B4J
			Return MeasureMultilineTextHeight(lblAutoresize.Font,lblAutoresize.Width,lblAutoresize.Text)
		#End If
	Else
		#if b4A
		Dim stuti As StringUtils
		Return MeasureTextWidth(lblAutoresize.Text,lblAutoresize.Font) > lblAutoresize.Width Or stuti.MeasureMultilineTextHeight(lblAutoresize,lblAutoresize.Text) > lblAutoresize.Height
		#Else
			Return MeasureTextWidth(lblAutoresize.Text,lblAutoresize.Font) > lblAutoresize.Width Or MeasureTextHeight(lblAutoresize.Text,lblAutoresize.Font) > lblAutoresize.Height 			
		#End If		
	End If
End Sub

#End Region

'An special txs to Alexander Stolte for its autoresize functions
'https://www.b4x.com/android/forum/threads/b4x-xui-autotextsizelabel.100187/
#Region 'Alexander Stolte' Functions
'https://www.b4x.com/android/forum/threads/b4x-xui-add-measuretextwidth-and-measuretextheight-to-b4xcanvas.91865/#content
Private Sub MeasureTextWidth(Text As String, Font1 As B4XFont) As Int
#If B4A
	Private bmp As Bitmap
	bmp.InitializeMutable(1, 1)'ignore
	Private cvs As Canvas
	cvs.Initialize2(bmp)
	Return cvs.MeasureStringWidth(Text, Font1.ToNativeFont, Font1.Size)
#Else If B4i
    Return Text.MeasureWidth(Font1.ToNativeFont)
#Else If B4J
    Dim jo As JavaObject
    jo.InitializeNewInstance("javafx.scene.text.Text", Array(Text))
    jo.RunMethod("setFont",Array(Font1.ToNativeFont))
    jo.RunMethod("setLineSpacing",Array(0.0))
    jo.RunMethod("setWrappingWidth",Array(0.0))
    Dim Bounds As JavaObject = jo.RunMethod("getLayoutBounds",Null)
    Return Bounds.RunMethod("getWidth",Null)
#End If
End Sub

'https://www.b4x.com/android/forum/threads/b4x-xui-add-measuretextwidth-and-measuretextheight-to-b4xcanvas.91865/#content
Private Sub MeasureTextHeight(Text As String, Font1 As B4XFont) As Int
#If B4A     
	Private bmp As Bitmap
	bmp.InitializeMutable(1, 1)'ignore
	Private cvs As Canvas
	cvs.Initialize2(bmp)
	Return cvs.MeasureStringHeight(Text, Font1.ToNativeFont, Font1.Size)
	
#Else If B4i
    Return Text.MeasureHeight(Font1.ToNativeFont)
#Else If B4J
    Dim jo As JavaObject
    jo.InitializeNewInstance("javafx.scene.text.Text", Array(Text))
    jo.RunMethod("setFont",Array(Font1.ToNativeFont))
    jo.RunMethod("setLineSpacing",Array(0.0))
    jo.RunMethod("setWrappingWidth",Array(0.0))
    Dim Bounds As JavaObject = jo.RunMethod("getLayoutBounds",Null)
    Return Bounds.RunMethod("getHeight",Null)
#End If
End Sub


#If B4I
'https://www.b4x.com/android/forum/threads/measuremultilinetextheight-in-ios.65556/#post-531390
Private Sub getTextHeight(Text As String,fo As Font,LbWidth As Float) As Float
  
	Dim tmpString As String = "大"
	Dim str() As String = Regex.Split(Chr(10),Text)
	Dim height As Float
	Dim number As Int
	Dim fontHeight As Float = tmpString.MeasureHeight(fo)
	For Each s As String In str
		number = s.MeasureWidth(fo)/LbWidth + 1
		height = height + number*fontHeight
	Next
	Return height + fontHeight
End Sub

#Else If B4J
'https://www.b4x.com/android/forum/threads/measure-multiline-text-height.84331/#content
Sub MeasureMultilineTextHeight (Font As Font, Width As Double, Text As String) As Double
   Dim jo As JavaObject = Me
   Return jo.RunMethod("MeasureMultilineTextHeight", Array(Font, Text, Width))
End Sub

#if Java
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL);
  }
#End If

#End if

#End Region

'create a label seting some characteristics
'must be tested in another plataforms
Private Sub CreateLabel(EventName As String, Lbl As Label) As B4XView
	Dim tmp_lbl As Label
	tmp_lbl.Initialize(EventName)
#If B4A
	tmp_lbl.SingleLine = True
	tmp_lbl.TextSize = Lbl.TextSize
	tmp_lbl.Typeface = Lbl.Typeface
	tmp_lbl.Text = Lbl.Text
	tmp_lbl.TextColor = Lbl.TextColor
#End If
	Return tmp_lbl
End Sub

'handle the click event
Private Sub cmdLabel_Click
	If SubExists(mCallBack,mEventName&"_Click") Then CallSub(mCallBack, mEventName&"_Click")
End Sub
