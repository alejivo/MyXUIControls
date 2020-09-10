B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
#Event: Click
#DesignerProperty: Key: Padding, DisplayName: Padding, FieldType: Int, DefaultValue: 1, Description: Space between content and the border.
#DesignerProperty: Key: AutoResize, DisplayName: Auto Resize, FieldType: Boolean, DefaultValue: False, Description: When this option is checked the button autoresizes the label.
#DesignerProperty: Key: OptionAText , DisplayName: Option A Text, FieldType: String, DefaultValue: , Description: Option A text Label
#DesignerProperty: Key: OptionBText , DisplayName: Option B Text, FieldType: String, DefaultValue: , Description: Option B text Label
#DesignerProperty: Key: SelectedOption, DisplayName:  SelectedOption, FieldType: String, DefaultValue: B, List: A|B
#DesignerProperty: Key: BackgroundColor, DisplayName: Background Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the background color
#DesignerProperty: Key: ForegroundColor, DisplayName: Foreground Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the foreground color
#DesignerProperty: Key: TextBackgroundColor, DisplayName: Text Background Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the background text color
#DesignerProperty: Key: TextForegroundColor, DisplayName: Text Foreground Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the foreground text color
#DesignerProperty: Key: BorderColor, DisplayName: Border Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the border color
#DesignerProperty: Key: Radius, DisplayName: Radius, FieldType: Int, DefaultValue: 0, Description: Radio of the button
#DesignerProperty: Key: BorderWidth, DisplayName: Border Tickness, FieldType: Int, DefaultValue: 0, Description: The border tickness
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private mLbl As Label
	Private xui As XUI 'ignore
	Private vPadding As Int
	Private vAutoResize As Boolean
	Private vTextAligment, vOptionAText, vOptionBText As String
	Private vBackgroundColor, vForegroundColor, vTextBackgroundColor, vTextForegroundColor,vBorderColor As Object
	Private vRadius, vBorderWidth As Int
	Private BackText, FrontText As String
	Private vSelectedOption As Char
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Object, lbl As Label, Props As Map)
	mBase = Base
	mLbl = lbl
	LoadProps(Props)
	If vSelectedOption = "A" Then
		BackText = vOptionBText
		FrontText = vOptionAText
	Else
		BackText = vOptionAText
		FrontText = vOptionBText
	End If
	CreateButton
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	If vSelectedOption = "A" Then
		BackText = vOptionBText
		FrontText = vOptionAText
	Else
		BackText = vOptionAText
		FrontText = vOptionBText
	End If
	CreateButton
End Sub

'Its return the choosen option between A or B 
Public Sub getState As Char
	Return vSelectedOption
End Sub

'Its allow change the estate between A or B
Public Sub setState(option As Char)
	If option = "A" Or option = "B" Then
		vSelectedOption = option
		PaintButton
	End If
End Sub

'paint the button acording to its state
Private Sub PaintButton
	If vSelectedOption = "A" Then
		BackText = vOptionBText
		FrontText = vOptionAText
	Else
		BackText = vOptionAText
		FrontText = vOptionBText
	End If
	CreateButton
End Sub

'create the button
Private Sub CreateButton
	mBase.RemoveAllViews
	'creo panel tracero
	Dim pnlBackground As B4XView = xui.CreatePanel("pnlBackground")
	pnlBackground.SetColorAndBorder(vBackgroundColor,vBorderWidth,vBorderColor,vRadius)
	pnlBackground.Width = mBase.Width
	pnlBackground.Height = mBase.Height	
	
	'etiqueta trasera izquierda
	Dim lblBackLeft As B4XView = CreateLabel("lblBackLeft",mLbl)
	lblBackLeft.TextColor = xui.PaintOrColorToColor(vTextBackgroundColor)
	lblBackLeft.Text = BackText
	lblBackLeft.Height = pnlBackground.Height-(vPadding*2)
	lblBackLeft.Width = pnlBackground.Width/2-(vPadding*2)
	lblBackLeft.SetTextAlignment("CENTER","CENTER")
	pnlBackground.AddView(lblBackLeft,vPadding,vPadding,lblBackLeft.Width,lblBackLeft.Height)
	If vAutoResize Then AutoResize(lblBackLeft)
	
	'etiqueta trasera derecha
	Dim lblBackRight As B4XView = CreateLabel("lblBackRight",mLbl)
	lblBackRight.TextColor = xui.PaintOrColorToColor(vTextBackgroundColor)
	lblBackRight.Text = BackText
	lblBackRight.Height = pnlBackground.Height-(vPadding*2)
	lblBackRight.Width = pnlBackground.Width/2-(vPadding*2)
	lblBackRight.SetTextAlignment("CENTER","CENTER")
	Dim left As Int = lblBackLeft.Width+vPadding+vPadding
	pnlBackground.AddView(lblBackRight,left,vPadding,lblBackRight.Width,lblBackRight.Height)
	If vAutoResize Then AutoResize(lblBackRight)
	
	'creo panel delantero
	Dim pnlForeground As B4XView = xui.CreatePanel("pnlForeground")
	pnlForeground.SetColorAndBorder(vForegroundColor,vBorderWidth,vBorderColor,vRadius)
	pnlForeground.Width = pnlBackground.Width/2
	pnlForeground.Height = pnlBackground.Height
	
	'creo etiqueta del panel delantero
	Dim lblFront As B4XView = CreateLabel("lblFront",mLbl)
	lblFront.TextColor = xui.PaintOrColorToColor(vTextForegroundColor)
	lblFront.Text = FrontText
	lblFront.Height = pnlForeground.Height-(vPadding*2)
	lblFront.Width = pnlForeground.Width-(vPadding*2)
	lblFront.SetTextAlignment("CENTER","CENTER")
	pnlForeground.AddView(lblFront,vPadding,vPadding,lblFront.Width,lblFront.Height)
	If vAutoResize Then AutoResize(lblFront)
	
	'agrego el panel trasero
	mBase.AddView(pnlBackground,0dip,0dip,mBase.Width,mBase.Height)
	'agrego a la derecha o izquierda segun se desee
	If vSelectedOption = "A" Then
		mBase.AddView(pnlForeground,0dip,0dip,pnlForeground.Width,mBase.Height)
	Else
		mBase.AddView(pnlForeground,pnlForeground.Width,0dip,pnlForeground.Width,mBase.Height)
	End If
End Sub

'load all propertys
Private Sub LoadProps(Props As Map)
	vTextAligment = Props.Get("TextAligment")
	vOptionAText = Props.Get("OptionAText")
	vOptionBText = Props.Get("OptionBText")
	vAutoResize = Props.Get("AutoResize")
	vPadding = Props.Get("Padding")
	vBackgroundColor = Props.Get("BackgroundColor")
	vForegroundColor = Props.Get("ForegroundColor")
	vTextBackgroundColor = Props.Get("TextBackgroundColor")
	vTextForegroundColor = Props.Get("TextForegroundColor")
	vBorderColor = Props.Get("BorderColor")
	vRadius = Props.Get("Radius")
	vBorderWidth = Props.Get("BorderWidth")
	vSelectedOption = Props.Get("SelectedOption")
End Sub

#Region Resize Label

'This function is based on Erel's code: https://www.b4x.com/android/forum/threads/custom-view-autotextsizelabel.30642/#post-177986
Private Sub AutoResize(lblAutoresize As B4XView)
	Dim multipleLines As Boolean = lblAutoresize.Text.Contains(CRLF)
	Dim size As Float
	For size = 2 To 80
		If CheckSize(lblAutoresize, size, multipleLines) Then Exit
	Next
	size = size - 0.5
	If CheckSize(lblAutoresize, size, multipleLines) Then size = size - 0.5
	lblAutoresize.TextSize = size
End Sub

'returns true if the size is too large
Private Sub CheckSize(lblAutoresize As B4XView, size As Float, multipleLines As Boolean) As Boolean
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
	tmp_lbl.TextColor = Lbl.TextColor
#End If
	Return tmp_lbl
End Sub

'thos functions intercept the button
Private Sub pnlBackground_Click
	Click
End Sub

Private Sub pnlForeground_Click
	Click
End Sub

'this function paint the stat
Private Sub Click
	If vSelectedOption = "A" Then
		vSelectedOption = "B"
		BackText = vOptionAText
		FrontText = vOptionBText
	Else
		vSelectedOption = "A"
		BackText = vOptionBText
		FrontText = vOptionAText
	End If
	CreateButton
	If SubExists(mCallBack,mEventName&"_Click") Then CallSub(mCallBack, mEventName&"_Click")
End Sub

