package b4a.MyXUIControls;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xuiimagebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.MyXUIControls.xuiimagebutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.MyXUIControls.xuiimagebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _objxui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imgicon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblbutton = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _cmdbutton = null;
public int _margin = 0;
public int _pressdelay = 0;
public int _leftmargin = 0;
public int _labelmargin = 0;
public String _imagefilename = "";
public String _textaligment = "";
public String _aligment = "";
public Object _pressedcolor = null;
public Object _basecolor = null;
public b4a.example.dateutils _dateutils = null;
public b4a.MyXUIControls.main _main = null;
public b4a.MyXUIControls.starter _starter = null;
public String  _base_resize(b4a.MyXUIControls.xuiimagebutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _bottomandcenter(b4a.MyXUIControls.xuiimagebutton __ref,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "bottomandcenter", false))
	 {return ((String) Debug.delegate(ba, "bottomandcenter", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
int _labelstartpoint = 0;
int _imagestartpoint = 0;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub BottomAndCenter(lbl As Label)";
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cmdButton");
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="cmdButton.Height = mBase.Height";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="cmdButton.Width = mBase.Width";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"lblButton",_lbl);
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="lblButton.Width = cmdButton.Width-Margin*2";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="lblButton.Height = mBase.Height";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="lblButton.Height = MeasureTextHeight(lblButton.Te";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._measuretextheight /*int*/ (null,__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont()));
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textaligment /*String*/ );
RDebugUtils.currentLine=20316175;
 //BA.debugLineNum = 20316175;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"imgIcon");
RDebugUtils.currentLine=20316176;
 //BA.debugLineNum = 20316176;BA.debugLine="If ImageFileName <> \"\" Then";
if ((__ref._imagefilename /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=20316177;
 //BA.debugLineNum = 20316177;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2-lblBu";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2-__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._labelmargin /*int*/ ));
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2-lblBut";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2-__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._labelmargin /*int*/ ));
RDebugUtils.currentLine=20316179;
 //BA.debugLineNum = 20316179;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_image = __c.LoadBitmap(__c.File.getDirAssets(),__ref._imagefilename /*String*/ );
RDebugUtils.currentLine=20316180;
 //BA.debugLineNum = 20316180;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_image.Resize((float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.True).getObject()));
 }else {
RDebugUtils.currentLine=20316182;
 //BA.debugLineNum = 20316182;BA.debugLine="imgIcon.Height = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (0));
RDebugUtils.currentLine=20316183;
 //BA.debugLineNum = 20316183;BA.debugLine="imgIcon.Width = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (0));
 };
RDebugUtils.currentLine=20316188;
 //BA.debugLineNum = 20316188;BA.debugLine="Dim LabelStartPoint As Int = (cmdButton.Width-lbl";
_labelstartpoint = (int) ((__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2);
RDebugUtils.currentLine=20316189;
 //BA.debugLineNum = 20316189;BA.debugLine="Dim ImageStartPoint As Int = (cmdButton.Width-img";
_imagestartpoint = (int) ((__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2);
RDebugUtils.currentLine=20316193;
 //BA.debugLineNum = 20316193;BA.debugLine="cmdButton.AddView(imgIcon, ImageStartPoint,Margin";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_imagestartpoint,__ref._margin /*int*/ ,__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20316194;
 //BA.debugLineNum = 20316194;BA.debugLine="cmdButton.AddView(lblButton,LabelStartPoint, imgI";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_labelstartpoint,(int) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._labelmargin /*int*/ ),__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2));
RDebugUtils.currentLine=20316197;
 //BA.debugLineNum = 20316197;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20316198;
 //BA.debugLineNum = 20316198;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(__ref._basecolor /*Object*/ ));
RDebugUtils.currentLine=20316199;
 //BA.debugLineNum = 20316199;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.MyXUIControls.xuiimagebutton __ref,String _eventname,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname,_lbl}));}
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub CreateLabel(EventName As String, Lbl A";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="tmp_lbl.SingleLine = True";
_tmp_lbl.setSingleLine(__c.True);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="tmp_lbl.TextSize = Lbl.TextSize";
_tmp_lbl.setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="tmp_lbl.Typeface = Lbl.Typeface";
_tmp_lbl.setTypeface(_lbl.getTypeface());
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="tmp_lbl.Text = Lbl.Text";
_tmp_lbl.setText(BA.ObjectToCharSequence(_lbl.getText()));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="tmp_lbl.TextColor = Lbl.TextColor";
_tmp_lbl.setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="End Sub";
return null;
}
public int  _measuretextheight(b4a.MyXUIControls.xuiimagebutton __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "measuretextheight", false))
	 {return ((Integer) Debug.delegate(ba, "measuretextheight", new Object[] {_text,_font1}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="Return cvs.MeasureStringHeight(Text, Font1.ToNati";
if (true) return (int) (_cvs.MeasureStringHeight(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
RDebugUtils.currentLine=20709394;
 //BA.debugLineNum = 20709394;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.MyXUIControls.xuiimagebutton __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "createimageview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _tmp_imgv = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim tmp_imgv As ImageView";
_tmp_imgv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="tmp_imgv.Initialize(EventName)";
_tmp_imgv.Initialize(ba,_eventname);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Return tmp_imgv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_imgv.getObject()));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return null;
}
public String  _centerallcontent(b4a.MyXUIControls.xuiimagebutton __ref,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "centerallcontent", false))
	 {return ((String) Debug.delegate(ba, "centerallcontent", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
int _contentsize = 0;
int _startpoint = 0;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub CenterAllContent(lbl As Label)";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cmdButton");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="cmdButton.Height = mBase.Height";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="cmdButton.Width = mBase.Width";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"imgIcon");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="If ImageFileName <> \"\" Then";
if ((__ref._imagefilename /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_image = __c.LoadBitmap(__c.File.getDirAssets(),__ref._imagefilename /*String*/ );
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_image.Resize((float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.True).getObject()));
 }else {
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="imgIcon.Height = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (0));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="imgIcon.Width = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (0));
 };
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"lblButton",_lbl);
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._labelmargin /*int*/ -__ref._leftmargin /*int*/ ));
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="lblButton.Width = MeasureTextWidth(lblButton.Text";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._measuretextwidth /*int*/ (null,__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont()));
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textaligment /*String*/ );
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Dim ContentSize As Int = imgIcon.Width+Margin+lbl";
_contentsize = (int) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._margin /*int*/ +__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="Dim StartPoint As Int = (cmdButton.Width-ContentS";
_startpoint = (int) ((__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_contentsize)/(double)2);
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="cmdButton.AddView(imgIcon,StartPoint,Margin, imgI";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_startpoint,__ref._margin /*int*/ ,__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._labelmargin /*int*/ ),__ref._margin /*int*/ ,__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(__ref._basecolor /*Object*/ ));
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="End Sub";
return "";
}
public int  _measuretextwidth(b4a.MyXUIControls.xuiimagebutton __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "measuretextwidth", false))
	 {return ((Integer) Debug.delegate(ba, "measuretextwidth", new Object[] {_text,_font1}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.MyXUIControls.xuiimagebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Private objXUI As XUI 'ignore";
_objxui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Private imgIcon As B4XView";
_imgicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Private lblButton As B4XView";
_lblbutton = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Private cmdButton As B4XView";
_cmdbutton = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Private Margin,PressDelay,LeftMargin, LabelMargin";
_margin = 0;
_pressdelay = 0;
_leftmargin = 0;
_labelmargin = 0;
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Private ImageFileName,TextAligment, Aligment  As";
_imagefilename = "";
_textaligment = "";
_aligment = "";
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Private PressedColor, BaseColor As Object";
_pressedcolor = new Object();
_basecolor = new Object();
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="End Sub";
return "";
}
public void  _cmdbutton_click(b4a.MyXUIControls.xuiimagebutton __ref) throws Exception{
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "cmdbutton_click", false))
	 {Debug.delegate(ba, "cmdbutton_click", null); return;}
ResumableSub_cmdButton_Click rsub = new ResumableSub_cmdButton_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdButton_Click extends BA.ResumableSub {
public ResumableSub_cmdButton_Click(b4a.MyXUIControls.xuiimagebutton parent,b4a.MyXUIControls.xuiimagebutton __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.MyXUIControls.xuiimagebutton __ref;
b4a.MyXUIControls.xuiimagebutton parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xuiimagebutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(PressedC";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(__ref._pressedcolor /*Object*/ ));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Sleep(PressDelay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xuiimagebutton", "cmdbutton_click"),__ref._pressdelay /*int*/ );
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(__ref._basecolor /*Object*/ ));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="If SubExists(mCallBack,mEventName&\"_Click\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _designercreateview(b4a.MyXUIControls.xuiimagebutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="LoadProps(Props) 'load propertys";
__ref._loadprops /*String*/ (null,_props);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Select Aligment.Trim";
switch (BA.switchObjectToInt(__ref._aligment /*String*/ .trim(),"CENTER","BOTTOM")) {
case 0: {
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="CenterAllContent(Lbl)";
__ref._centerallcontent /*String*/ (null,_lbl);
 break; }
case 1: {
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="BottomAndCenter(Lbl)";
__ref._bottomandcenter /*String*/ (null,_lbl);
 break; }
default: {
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="LeftAllContent(Lbl)";
__ref._leftallcontent /*String*/ (null,_lbl);
 break; }
}
;
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="End Sub";
return "";
}
public String  _loadprops(b4a.MyXUIControls.xuiimagebutton __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "loadprops", false))
	 {return ((String) Debug.delegate(ba, "loadprops", new Object[] {_props}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub LoadProps(Props As Map)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Margin = Props.Get(\"Margin\")";
__ref._margin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Margin"))));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="LabelMargin = Props.Get(\"LabelMargin\")";
__ref._labelmargin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("LabelMargin"))));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="TextAligment = Props.Get(\"TextAligment\")";
__ref._textaligment /*String*/  = BA.ObjectToString(_props.Get((Object)("TextAligment")));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Aligment = Props.Get(\"Aligment\")";
__ref._aligment /*String*/  = BA.ObjectToString(_props.Get((Object)("Aligment")));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="ImageFileName = Props.Get(\"ImageFileName\")";
__ref._imagefilename /*String*/  = BA.ObjectToString(_props.Get((Object)("ImageFileName")));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="LeftMargin = Props.Get(\"LeftMargin\")";
__ref._leftmargin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("LeftMargin"))));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="PressedColor = Props.Get(\"PressedColor\")";
__ref._pressedcolor /*Object*/  = _props.Get((Object)("PressedColor"));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="BaseColor = Props.Get(\"BaseColor\")";
__ref._basecolor /*Object*/  = _props.Get((Object)("BaseColor"));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="PressDelay = Props.Get(\"PressDelay\")";
__ref._pressdelay /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("PressDelay"))));
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="End Sub";
return "";
}
public String  _leftallcontent(b4a.MyXUIControls.xuiimagebutton __ref,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "leftallcontent", false))
	 {return ((String) Debug.delegate(ba, "leftallcontent", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub LeftAllContent(lbl As Label)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cmdButton");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="cmdButton.Height = mBase.Height";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="cmdButton.Width = mBase.Width";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"imgIcon");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="If ImageFileName <> \"\" Then";
if ((__ref._imagefilename /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_image = __c.LoadBitmap(__c.File.getDirAssets(),__ref._imagefilename /*String*/ );
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_image.Resize((float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.True).getObject()));
 }else {
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="imgIcon.Height = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (0));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="imgIcon.Width = 0";
__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (0));
 };
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"lblButton",_lbl);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._margin /*int*/ *2));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._labelmargin /*int*/ -__ref._leftmargin /*int*/ ));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER",__ref._textaligment /*String*/ );
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="cmdButton.AddView(imgIcon,LeftMargin,Margin, imgI";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._leftmargin /*int*/ ,__ref._margin /*int*/ ,__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._imgicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._labelmargin /*int*/ ),__ref._margin /*int*/ ,__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._lblbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._cmdbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._objxui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(__ref._basecolor /*Object*/ ));
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.MyXUIControls.xuiimagebutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xuiimagebutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
}