package GraphandBinarytree;

public class EmployeeImportance690 {
    // My approach[Wrong!]
    // BFS
    // Find the root inside the tree then add the importance of itself and it's child
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;


        if (employees == null) {
            return;
        }

        getImportance(employees.left, id);
        getImportance(employees.right, id);

        if (employees.id == id) {
            if (employees.left != null) {
                result += employees.left.importance;
            }

            if (employees.left != null) {
                result += employees.right.importance;
            }
        }

        return result;


    }
}
