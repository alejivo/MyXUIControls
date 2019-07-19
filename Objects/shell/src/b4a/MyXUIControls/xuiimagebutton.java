
package b4a.MyXUIControls;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xuiimagebutton {
    public static RemoteObject myClass;
	public xuiimagebutton() {
	}
    public static PCBA staticBA = new PCBA(null, xuiimagebutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _objxui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _imgicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cmdbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _margin = RemoteObject.createImmutable(0);
public static RemoteObject _pressdelay = RemoteObject.createImmutable(0);
public static RemoteObject _leftmargin = RemoteObject.createImmutable(0);
public static RemoteObject _labelmargin = RemoteObject.createImmutable(0);
public static RemoteObject _imagefilename = RemoteObject.createImmutable("");
public static RemoteObject _textaligment = RemoteObject.createImmutable("");
public static RemoteObject _aligment = RemoteObject.createImmutable("");
public static RemoteObject _pressedcolor = RemoteObject.declareNull("Object");
public static RemoteObject _basecolor = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.MyXUIControls.main _main = null;
public static b4a.MyXUIControls.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Aligment",_ref.getField(false, "_aligment"),"BaseColor",_ref.getField(false, "_basecolor"),"cmdButton",_ref.getField(false, "_cmdbutton"),"DateUtils",_ref.getField(false, "_dateutils"),"ImageFileName",_ref.getField(false, "_imagefilename"),"imgIcon",_ref.getField(false, "_imgicon"),"LabelMargin",_ref.getField(false, "_labelmargin"),"lblButton",_ref.getField(false, "_lblbutton"),"LeftMargin",_ref.getField(false, "_leftmargin"),"Margin",_ref.getField(false, "_margin"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"objXUI",_ref.getField(false, "_objxui"),"PressDelay",_ref.getField(false, "_pressdelay"),"PressedColor",_ref.getField(false, "_pressedcolor"),"TextAligment",_ref.getField(false, "_textaligment")};
}
}