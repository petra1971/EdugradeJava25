public class Practice_1 {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        System.out.println("Variablen har värdet: " + age + " och är av typen: " + ((Object) age).getClass().getName());
        System.out.println("Variablen har värdet: " + height + " och är av typen: " + ((Object) height).getClass().getName());
        System.out.println("Variablen har värdet: " + initial + " och är av typen: " + ((Object) initial).getClass().getName());
        System.out.println("Variablen har värdet: " + name + " och är av typen: " + ((Object) name).getClass().getName());
        System.out.println("Variablen har värdet: " + isStudent + " och är av typen: " + ((Object) isStudent).getClass().getName());
    }
}
