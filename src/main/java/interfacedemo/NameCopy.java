package interfacedemo;

public interface NameCopy {

	default  String getName() {
		return "yanggaoji-111copy接口的默认default方法";
	}
}
