package com.cunjunwang.leetcodejava.solutions.solution690_EmployeeImportance;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class EmployeeImportance {

    private class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    /**
     * You are given a data structure of employee information, which includes
     * the employee's unique id, his importance value and his direct subordinates' id.
     * For example, employee 1 is the leader of employee 2, and employee 2 is the
     * leader of employee 3. They have importance value 15, 10 and 5, respectively.
     * Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has
     * [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3
     * is also a subordinate of employee 1, the relationship is not direct.
     * Now given the employee information of a company, and an employee id, you need
     * to return the total importance value of this employee and all his subordinates.
     * <p>
     * Example 1:
     * Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
     * Output: 11
     * Explanation:
     * Employee 1 has importance value 5, and he has two direct subordinates:
     * employee 2 and employee 3. They both have importance value 3. So the total
     * importance value of employee 1 is 5 + 3 + 3 = 11.
     *
     * @param employees
     * @param id
     * @return
     */
    public int getImportance(List<Employee> employees, int id) {
        if (employees == null || employees.isEmpty())
            return 0;
        int sum = 0;
        Queue<Employee> queue = new LinkedList<>();
        Employee e = findEmployee(employees, id);
        queue.add(e);
        while (!queue.isEmpty()) {
            Employee employee = queue.remove();
            sum += employee.importance;
            if (employee.subordinates != null && !employee.subordinates.isEmpty()) {
                for (Integer i : employee.subordinates) {
                    Employee find = findEmployee(employees, i);
                    if (find != null) {
                        queue.add(find);
                    }
                }
            }
        }
        return sum;
    }

    private Employee findEmployee(List<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                employees.remove(e);
                return e;
            }
        }
        return null;
    }

}
