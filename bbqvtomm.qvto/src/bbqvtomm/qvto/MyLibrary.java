package bbqvtomm.qvto;

import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;

import bbqvtomm.model.mymodel.TestClass;

@Module(packageURIs = "http://www.example.org/mymodel")
public class MyLibrary {

    @Operation(contextual = true)
    public String getAttrUpperCase(TestClass obj) {
        return obj.getAttr().toUpperCase();
    }

}
