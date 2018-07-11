package learning;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Test01 {
	public void test01(Map<String,Object> map , List<Integer> list){
		
	}
	
	public Map<String,String> test02(){
		return null;
	}
	
	public static void main(String[] args) {
		/*try {
			Method test01 = Test01.class.getDeclaredMethod("test01", Map.class,List.class);
			
			Type[] types = test01.getGenericParameterTypes();
			for (Type type : types) {
				if(type instanceof ParameterizedType){
					Type[] tt = ((ParameterizedType) type).getActualTypeArguments();
					for (Type type2 : tt) {
						System.out.println("泛型为： "+ type2);
					}
				}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			Method test01 = Test01.class.getDeclaredMethod("test02",null);
			Type types = test01.getGenericReturnType();
			if(types instanceof ParameterizedType){
				Type[] tt = ((ParameterizedType) types).getActualTypeArguments();
				for (Type type2 : tt) {
					System.out.println("泛型为： "+ type2);
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
