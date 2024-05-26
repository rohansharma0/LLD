package Pattern.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN" , new Employee());
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
