import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.BeanInfo;

public class Introsepction {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Introsepction.class);
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property Name: " + propertyDescriptor.getName());
                System.out.println("Property Type: " + propertyDescriptor.getPropertyType());
                System.out.println("Read Method: " + propertyDescriptor.getReadMethod());
                System.out.println("Write Method: " + propertyDescriptor.getWriteMethod());
                System.out.println("------------------------------");
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
