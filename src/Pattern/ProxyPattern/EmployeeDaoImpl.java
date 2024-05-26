package Pattern.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("Created new row in the Employee Table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employeeId : " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from the DB with employeeId : " + employeeId);
        return new Employee();
    }
}
