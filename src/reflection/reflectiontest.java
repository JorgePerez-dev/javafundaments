package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import addresbook.AddressBook;  // 
import addresbook.Contact;

public class reflectiontest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException{

        // Forma 1
        Class<AddressBook> cls1 = AddressBook.class;

        // Forma 2
        Class<?> class2 = AddressBook.class;

        // Forma 3
        Class<?> class3 = new AddressBook().getClass();

        // Forma 4
        try {
            Class<?> class4 = Class.forName("addressbook.AddressBook"); // 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 🔥 MOVIDO fuera del catch (IMPORTANTE)
        inspectClass(cls1);
        inspectConstructors(cls1);
        inspectMethods(cls1);
        inspectAnnotations(cls1);
        
                Contact contact1 = new Contact("jorge", "675849");
                
                manipulateObject(contact1);
                
                invokeMethodofAnObject(contact1);
                
        
        
    }
    
    
    
    
    
    
    
    
    private static void invokeMethodofAnObject(Object object ) {
    	Class<?> cls = object.getClass();
    	try {
			Method method = cls.getDeclaredMethod("getName", String.class);
			method.invoke(object, null);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}








	private static  void manipulateObject(Contact contact) throws NoSuchFieldException, SecurityException {
    	Class<?> cls = contact.getClass();
    	
    	Field[] fields = cls.getDeclaredFields();
    	
    	Field field = cls.getDeclaredField("phone");
    	System.out.println(contact.getPhone());
    	//change the access modifier from private to public
    	
    	//read the valuer of a specified field
    	
    	//modify the value of a field of the object;
    	try {
			field.set(fields, field);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
		
	}
    
    

    private static void inspectClass(Class<AddressBook> cls1) {
        cls1.getDeclaredConstructors();
        cls1.getDeclaredMethods();
        cls1.getDeclaredFields();
        cls1.getAnnotations();

        for (Field field : cls1.getDeclaredFields()) {
            System.out.println("field name is " + field.getName());
            System.out.println("field type is " + field.getType().getSimpleName());
        }
    }

    private static void inspectConstructors(Class<AddressBook> cls1) {
        cls1.getDeclaredConstructors();
        cls1.getDeclaredMethods();
        cls1.getDeclaredFields();
        cls1.getAnnotations();

        for (Constructor<?> constructor : cls1.getDeclaredConstructors()) {
            System.out.println("Constructor: " + constructor.getName());
        }
    }

    
    private static void inspectMethods(Class<AddressBook> cls1) {

        Method[] ms = cls1.getDeclaredMethods();

        for (int i = 0; i < ms.length; i++) {

            System.out.println("method name is " + ms[i].getName());

            Parameter[] params = ms[i].getParameters();

            for (int j = 0; j < params.length; j++) {
                System.out.println("method param is " + params[j].getName() +
                                   " type is " + params[j].getType().getSimpleName());
            }
        }
    }

    private static void inspectAnnotations(Class<AddressBook> cls1) {

        for (Annotation annotation : cls1.getAnnotations()) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}