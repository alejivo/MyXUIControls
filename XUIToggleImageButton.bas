B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
#Event: Click
#DesignerProperty: Key: Margin, DisplayName: Margin, FieldType: Int, DefaultValue: 1, Description: Space between content and the border.
#DesignerProperty: Key: LabelMargin, DisplayName: LabelMargin, FieldType: Int, DefaultValue: 10, Description: Space between the image and label
#DesignerProperty: Key: LeftMargin, DisplayName: Left Margin, FieldType: Int, DefaultValue: 10, Description: Space between the left side, only on LEFT aligment.
#DesignerProperty: Key: ImageFileName, DisplayName: Base Image File, FieldType: String, DefaultValue: , Description: Set the image filename with extension to be loaded as icon.
#DesignerProperty: Key: PressedFileName, DisplayName: Pressed Image File, FieldType: String, DefaultValue: , Description: Set the image filename with extension to be loaded as icon when is activated.
#DesignerProperty: Key: BaseColor, DisplayName: Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the button color.
#DesignerProperty: Key: SelectedColor, DisplayName: Selected Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the button color when the user press the button.
#DesignerProperty: Key: Aligment, DisplayName:  Aligment, FieldType: String, DefaultValue: CENTER, List: LEFT|CENTER|BOTTOM
#DesignerProperty: Key: TextAligment, DisplayName:  Text Aligment, FieldType: String, DefaultValue: CENTER, List: LEFT|CENTER|RIGHT
#DesignerProperty: Key: AutoResize, DisplayName: Label Auto Resize, FieldType: Boolean, DefaultValue: False, Description: When this option is checked the button autoresizes the label.
'draw lines
#DesignerProperty: Key: DrawLeftLine, DisplayName: Draw Left Line, FieldType: Boolean, DefaultValue: False, Description: When this option is checked draw a left line.
#DesignerProperty: Key: DrawRightLine, DisplayName: Draw Right Line, FieldType: Boolean, DefaultValue: False, Description: When this option is checked draw a right line.
#DesignerProperty: Key: DrawTopLine, DisplayName: Draw Top Line, FieldType: Boolean, DefaultValue: False, Description: When this option is checked draw a top line.
#DesignerProperty: Key: DrawBottomLine, DisplayName: Draw Bottom Line, FieldType: Boolean, DefaultValue: False, Description: When this option is checked draw a bottom line.
#DesignerProperty: Key: LineColor, DisplayName: Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the line color.
#DesignerProperty: Key: LineThickness, DisplayName: Line Thickness, FieldType: Int, DefaultValue: 1, Description: Use to select the line thickness.

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private objXUI As XUI 'ignore
	Private imgIcon As B4XView
	Private lblButton As B4XView
	Private cmdButton As B4XView
	Private mLbl As Label
	'properties globals
	Private Margin,LeftMargin, LabelMargin, LineColor, LineThickness As Int
	Private PressedFileName, ImageFileName,TextAligment, Aligment  As String
	Private SelectedColor, BaseColor As Object
	Private PressedState As Boolean = False
	Private vAutoResize,vDrawLeftLine,vDrawRightLine, vDrawTopLine, vDrawBottomLine As Boolean
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (base As Object, Lbl As Label, Props As Map)
	mBase = base
	mLbl = Lbl
	LoadProps(Props) 'load propertys
	PaintControl 'paint the control
End Sub

'paint the control by its position
Private Sub PaintControl
	mBase.RemoveAllViews
	Select Aligment.Trim
		Case "CENTER"
			CenterAllContent
		Case "BOTTOM"
			BottomAndCenter
		Case Else
			LeftAllContent
	End Select
	If vDrawLeftLine Then DrawLeftLine
	If vDrawRightLine Then DrawRightLine
	If vDrawTopLine Then DrawTopLine
	If vDrawBottomLine Then DrawBottomLine
	If vAutoResize Then AutoResizeLabel
End Sub

#Region Lines

'draw a left line
Private Sub DrawLeftLine
	Dim bc As BitmapCreator
	Dim r As B4XRect
	Dim img As B4XView = CreateImageView("DrawLeftLineIMG")
	r.Initialize(0,0,LineThickness,mBase.Height)
	bc.Initialize(LineThickness,mBase.Height)
	bc.DrawRect(r,LineColor,True,1dip)
	img.SetBitmap(bc.Bitmap)
	mBase.AddView(img,0,0,LineThickness,mBase.Height)
End Sub

'draw a right line
Private Sub DrawRightLine
	Dim bc As BitmapCreator
	Dim r As B4XRect
	Dim img As B4XView = CreateImageView("DrawRightLineIMG")
	r.Initialize(0,0,LineThickness,mBase.Height)
	bc.Initialize(LineThickness,mBase.Height)
	bc.DrawRect(r,LineColor,True,1dip)
	img.SetBitmap(bc.Bitmap)
	mBase.AddView(img,mBase.Width-LineThickness,0,LineThickness,mBase.Height)
End Sub

'draw a top line
Private Sub DrawTopLine
	Dim bc As BitmapCreator
	Dim r As B4XRect
	Dim img As B4XView = CreateImageView("DrawRightLineIMG")
	r.Initialize(0,0,mBase.Width,LineThickness)
	bc.Initialize(mBase.Width,LineThickness)
	bc.DrawRect(r,LineColor,True,1dip)
	img.SetBitmap(bc.Bitmap)
	mBase.AddView(img,0,0,mBase.Width,LineThickness)
End Sub

'draw a bottom line
Private Sub DrawBottomLine
	Dim bc As BitmapCreator
	Dim r As B4XRect
	Dim img As B4XView = CreateImageView("DrawRightLineIMG")
	r.Initialize(0,0,mBase.Width,LineThickness)
	bc.Initialize(mBase.Width,LineThickness)
	bc.DrawRect(r,LineColor,True,1dip)
	img.SetBitmap(bc.Bitmap)
	mBase.AddView(img,0,mBase.Height-LineThickness,mBase.Width,LineThickness)
End Sub

#End Region

#Region Resize Label

'This function is based on Erel's code: https://www.b4x.com/android/forum/threads/custom-view-autotextsizelabel.30642/#post-177986
Private Sub AutoResizeLabel
	Dim multipleLines As Boolean = lblButton.Text.Contains(CRLF)
	Dim size As Float
	For size = 2 To 80
		If CheckSize(size, multipleLines) Then Exit
	Next
	size = size - 0.5
	If CheckSize(size, multipleLines) Then size = size - 0.5
	lblButton.TextSize = size
End Sub

'returns true if the size is too large
Private Sub CheckSize(size As Float, multipleLines As Boolean) As Boolean
	lblButton.TextSize = size
	If multipleLines Then
		#If B4A
		Dim su As StringUtils
		Return su.MeasureMultilineTextHeight(lblButton,lblButton.Text) > lblButton.Height
		#Else if B4I
		Dim tmplbl As Label = lblButton
		tmplbl.Multiline = True
		lblButton = tmplbl
		'Return MeasureTextHeight(lblButton.Text,lblButton.Font) > lblButton.Height
		Return getTextHeight(lblButton.Text,lblButton.Font,lblButton.Width) > lblButton.Height
		#Else B4J
		|Return MeasureMultilineTextHeight(lblButton.Font,lblButton.Width,lblButton.Text)
		#End If
	Else
		#if b4A
		Dim stuti As StringUtils
		Return MeasureTextWidth(lblButton.Text,lblButton.Font) > lblButton.Width Or stuti.MeasureMultilineTextHeight(lblButton,lblButton.Text) > lblButton.Height
		#Else
		Return MeasureTextWidth(lblButton.Text,lblButton.Font) > lblButton.Width Or MeasureTextHeight(lblButton.Text,lblButton.Font) > lblButton.Height 			
		#End If		
	End If
End Sub

#End Region

'Return if the buttom is pressed or not
Public Sub GetIsPressed As Boolean
	Return PressedState
End Sub

'This function fit the icon top the label
'Its dont use LeftMargin
Private Sub BottomAndCenter
	'inizialize the base object
	cmdButton = objXUI.CreatePanel("cmdButton")
	cmdButton.Height = mBase.Height
	cmdButton.Width = mBase.Width
	
	'create label
	lblButton = CreateLabel("lblButton", mLbl)
	lblButton.Width = cmdButton.Width-Margin*2
	lblButton.Height = mBase.Height
	lblButton.Height = MeasureTextHeight(lblButton.Text, lblButton.Font) 'fit to the selected font
	lblButton.SetTextAlignment("CENTER", TextAligment)
	'lblButton.SetColorAndBorder(objXUI.Color_Green,2dip,objXUI.Color_Red,10dip)
	
	'inizialize and load the icon object
	Dim tempFileName As String
	If PressedState = False Then
		tempFileName = ImageFileName
	Else
		If PressedFileName <> "" Then tempFileName = PressedFileName Else tempFileName =ImageFileName
	End If
	imgIcon = CreateImageView("imgIcon")
	If tempFileName <> "" Then
		imgIcon.Height = cmdButton.Height-Margin*2-lblButton.Height-LabelMargin
		imgIcon.Width = cmdButton.Height-Margin*2-lblButton.Height-LabelMargin
		Dim image As Bitmap = LoadBitmap(File.DirAssets,tempFileName)
		imgIcon.SetBitmap(image.Resize(imgIcon.Width, imgIcon.Height, True)) 'fit on the box
	Else
		imgIcon.Height = 0
		imgIcon.Width = 0
	End If
	
	
	'calculate the center startposition
	Dim LabelStartPoint As Int = (cmdButton.Width-lblButton.Width)/2
	Dim ImageStartPoint As Int = (cmdButton.Width-imgIcon.Width)/2
	
	
	'load an positionate icons
	cmdButton.AddView(imgIcon, ImageStartPoint,Margin, imgIcon.Width, imgIcon.Height)
	cmdButton.AddView(lblButton,LabelStartPoint, imgIcon.Height+LabelMargin, lblButton.Width,lblButton.Height*2)
	
	'ad the button to the base view
	mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBase.Height)
	mBase.Color = objXUI.PaintOrColorToColor(BaseColor)
End Sub


'This function fit all the content at center
'Its dont use LeftMargin
Private Sub CenterAllContent
	'inizialize the base object
	cmdButton = objXUI.CreatePanel("cmdButton")
	cmdButton.Height = mBase.Height
	cmdButton.Width = mBase.Width
	
	'inizialize and load the icon object
	Dim tempFileName As String
	If PressedState = False Then 
		tempFileName = ImageFileName 
	Else 
		If PressedFileName <> "" Then tempFileName = PressedFileName Else tempFileName =ImageFileName
	End If
	imgIcon = CreateImageView("imgIcon")
	If tempFileName <> "" Then
		imgIcon.Height = cmdButton.Height-Margin*2
		imgIcon.Width = cmdButton.Height-Margin*2
		Dim image As Bitmap = LoadBitmap(File.DirAssets,tempFileName)
		imgIcon.SetBitmap(image.Resize(imgIcon.Width, imgIcon.Height, True)) 'fit on the box
	Else
		imgIcon.Height = 0
		imgIcon.Width = 0
	End If
	
	'create label
	lblButton = CreateLabel("lblButton", mLbl)
	lblButton.Height = cmdButton.Height-Margin*2
	lblButton.Width = cmdButton.Width-imgIcon.Width-LabelMargin-LeftMargin
	lblButton.Width = MeasureTextWidth(lblButton.Text, lblButton.Font)'change size to fit string
	lblButton.SetTextAlignment("CENTER", TextAligment)
	'lblButton.SetColorAndBorder(objXUI.Color_Green,2dip,objXUI.Color_Red,10dip)
	
	'calculate the center startposition
	Dim ContentSize As Int = imgIcon.Width+Margin+lblButton.Width
	Dim StartPoint As Int = (cmdButton.Width-ContentSize)/2
	
	
	'load an positionate icons
	cmdButton.AddView(imgIcon,StartPoint,Margin, imgIcon.Width, imgIcon.Height)
	cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.Width+LabelMargin,Margin,lblButton.Width, lblButton.Height)
	
	'ad the button to the base view
	mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBase.Height)
	mBase.Color = objXUI.PaintOrColorToColor(BaseColor)
End Sub

'This function fit all the content to the left side
'Its uses the LeftMargin
Private Sub LeftAllContent
	'inizialize the base object
	cmdButton = objXUI.CreatePanel("cmdButton")
	cmdButton.Height = mBase.Height
	cmdButton.Width = mBase.Width
	
	'inizialize and load the icon object
	Dim tempFileName As String
	If PressedState = False Then
		tempFileName = ImageFileName
	Else
		If PressedFileName <> "" Then tempFileName = PressedFileName Else tempFileName =ImageFileName
	End If
	imgIcon = CreateImageView("imgIcon")
	If tempFileName <> "" Then
		imgIcon.Height = cmdButton.Height-Margin*2
		imgIcon.Width = cmdButton.Height-Margin*2
		Dim image As Bitmap = LoadBitmap(File.DirAssets,tempFileName)
		imgIcon.SetBitmap(image.Resize(imgIcon.Width, imgIcon.Height, True)) 'fit on the box
	Else
		imgIcon.Height = 0
		imgIcon.Width = 0
	End If
	
	'create label
	lblButton = CreateLabel("lblButton", mLbl)
	lblButton.Height = cmdButton.Height-Margin*2
	lblButton.Width = cmdButton.Width-imgIcon.Width-LabelMargin-LeftMargin
	lblButton.SetTextAlignment("CENTER", TextAligment)
	'lblButton.SetColorAndBorder(objXUI.Color_Green,2dip,objXUI.Color_Red,10dip)
	
	'load an positionate icons
	cmdButton.AddView(imgIcon,LeftMargin,Margin, imgIcon.Width, imgIcon.Height)
	cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.Width+LabelMargin,Margin,lblButton.Width, lblButton.Height)
	
	'ad the button to the base view
	mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBase.Height)
	mBase.Color = objXUI.PaintOrColorToColor(BaseColor)
End Sub

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


'Loads all properties in to the variables
Public Sub LoadProps(Props As Map)
	Margin = Props.Get("Margin")
	LabelMargin = Props.Get("LabelMargin")
	TextAligment = Props.Get("TextAligment")
	Aligment = Props.Get("Aligment")
	ImageFileName = Props.Get("ImageFileName")
	PressedFileName = Props.Get("PressedFileName")
	LeftMargin = Props.Get("LeftMargin")
	SelectedColor = Props.Get("SelectedColor")
	BaseColor = Props.Get("BaseColor")
	LineThickness = Props.Get("LineThickness")
	LineColor = Props.Get("LineColor")
	vAutoResize = Props.Get("AutoResize")
	vDrawLeftLine = Props.Get("DrawLeftLine")
	vDrawRightLine = Props.Get("DrawRightLine")
	vDrawTopLine = Props.Get("DrawTopLine")
	vDrawBottomLine = Props.Get("DrawBottomLine")
	'defaults
	If LineThickness < 1dip Then LineThickness = 1dip
End Sub

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

Private Sub CreateImageView(EventName As String) As B4XView
	Dim tmp_imgv As ImageView
	tmp_imgv.Initialize(EventName)
	Return tmp_imgv
End Sub

'this implementation haves a togle implementation
Private Sub cmdButton_Click
	If PressedState = True Then
		PressedState = False
		PaintControl
		mBase.Color = objXUI.PaintOrColorToColor(BaseColor)
	Else
		PressedState = True
		PaintControl
		mBase.Color = objXUI.PaintOrColorToColor(SelectedColor)
	End If
	If SubExists(mCallBack,mEventName&"_Click") Then CallSub(mCallBack, mEventName&"_Click")
End Sub


Private Sub Base_Resize (Width As Double, Height As Double)
  	mBase.RemoveAllViews
	PaintControl
End Sub