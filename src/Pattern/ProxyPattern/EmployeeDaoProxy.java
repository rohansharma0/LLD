package Pattern.ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            this.employeeDao.create(client,employee);
        }else {
            System.out.println("Access Denied!!");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            this.employeeDao.delete(client,employeeId);
        }else {
            System.out.println("Access Denied!!");
        }
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return this.employeeDao.get(client,employeeId);
        }else {
            System.out.println("Access Denied!!");
        }
        return null;
    }
}
