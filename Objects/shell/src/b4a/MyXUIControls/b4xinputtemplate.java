
package b4a.MyXUIControls;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xinputtemplate {
    public static RemoteObject myClass;
	public b4xinputtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xinputtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _text = RemoteObject.createImmutable("");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4a.MyXUIControls.b4xdialog");
public static RemoteObject _regexpattern = RemoteObject.createImmutable("");
public static RemoteObject _textfield1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.MyXUIControls.main _main = null;
public static b4a.MyXUIControls.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"IME",_ref.getField(false, "_ime"),"lblTitle",_ref.getField(false, "_lbltitle"),"mBase",_ref.getField(false, "_mbase"),"RegexPattern",_ref.getField(false, "_regexpattern"),"Text",_ref.getField(false, "_text"),"TextField1",_ref.getField(false, "_textfield1"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}