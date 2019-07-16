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
#DesignerProperty: Key: ImageFileName, DisplayName: Image File Name, FieldType: String, DefaultValue: , Description: Set the image filename to be loaded as icon.
#DesignerProperty: Key: BaseColor, DisplayName: Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the button color.
#DesignerProperty: Key: PressedColor, DisplayName: Press Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Use to select the button color when the user press the button.
#DesignerProperty: Key: Aligment, DisplayName:  Aligment, FieldType: String, DefaultValue: CENTER, List: LEFT|CENTER
#DesignerProperty: Key: TextAligment, DisplayName:  Text Aligment, FieldType: String, DefaultValue: CENTER, List: LEFT|CENTER|RIGHT
#DesignerProperty: Key: PressDelay, DisplayName: Press Delay, FieldType: Int, DefaultValue: 500, Description: Time (on miliseconds) betwen the pressed color and back to base color.

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private objXUI As XUI 'ignore
	Private imgIcon As B4XView
	Private lblButton As B4XView
	Private cmdButton As B4XView
	'properties globals
	Private Margin,PressDelay,LeftMargin, LabelMargin As Int
	Private ImageFileName,TextAligment, Aligment  As String
	Private PressedColor, BaseColor As Object
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	LoadProps(Props) 'load propertys
	If Aligment.Trim = "CENTER" Then
		CenterAllContent(Lbl)
	Else
		LeftAllContent(Lbl)
	End If
End Sub

'This function fit all the content at center
'Its dont use LeftMargin
Private Sub CenterAllContent(lbl As Label)
	'inizialize the base object
	cmdButton = objXUI.CreatePanel("cmdButton")
	cmdButton.Height = mBase.Height
	cmdButton.Width = mBase.Width
	
	'inizialize and load the icon object
	imgIcon = CreateImageView("imgIcon")
	If ImageFileName <> "" Then
		imgIcon.Height = cmdButton.Height-Margin*2
		imgIcon.Width = cmdButton.Height-Margin*2
		Dim image As Bitmap = LoadBitmap(File.DirAssets,ImageFileName)
		imgIcon.SetBitmap(image.Resize(imgIcon.Width, imgIcon.Height, True)) 'fit on the box
	Else
		imgIcon.Height = 0
		imgIcon.Width = 0
	End If
	
	'create label
	lblButton = CreateLabel("lblButton", lbl)
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
Private Sub LeftAllContent(lbl As Label)
	'inizialize the base object
	cmdButton = objXUI.CreatePanel("cmdButton")
	cmdButton.Height = mBase.Height
	cmdButton.Width = mBase.Width
	
	'inizialize and load the icon object
	imgIcon = CreateImageView("imgIcon")
	If ImageFileName <> "" Then
		imgIcon.Height = cmdButton.Height-Margin*2
		imgIcon.Width = cmdButton.Height-Margin*2
		Dim image As Bitmap = LoadBitmap(File.DirAssets,ImageFileName)
		imgIcon.SetBitmap(image.Resize(imgIcon.Width, imgIcon.Height, True)) 'fit on the box
	Else
		imgIcon.Height = 0
		imgIcon.Width = 0
	End If
	
	'create label
	lblButton = CreateLabel("lblButton", lbl)
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

'An special thanks to "klaus" function
Private Sub MeasureTextWidth(Text As String, Font1 As B4XFont) As Int
#If B4A
	Private bmp As Bitmap
	bmp.InitializeMutable(2dip, 2dip)
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

'Loads all properties in to the variables
Public Sub LoadProps(Props As Map)
	Margin = Props.Get("Margin")
	LabelMargin = Props.Get("LabelMargin")
	TextAligment = Props.Get("TextAligment")
	Aligment = Props.Get("Aligment")
	ImageFileName = Props.Get("ImageFileName")
	LeftMargin = Props.Get("LeftMargin")
	PressedColor = Props.Get("PressedColor")
	BaseColor = Props.Get("BaseColor")
	PressDelay = Props.Get("PressDelay")
End Sub

Private Sub CreateLabel(EventName As String, Lbl As Label) As B4XView
	Dim tmp_lbl As Label
	tmp_lbl.Initialize(EventName)
	tmp_lbl.SingleLine = True
	#if b4a
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

Private Sub cmdButton_Click
	mBase.Color = objXUI.PaintOrColorToColor(PressedColor)
	Sleep(PressDelay)
	mBase.Color = objXUI.PaintOrColorToColor(BaseColor)
	If SubExists(mCallBack,mEventName&"_Click") Then CallSub(mCallBack, mEventName&"_Click")
End Sub


Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub