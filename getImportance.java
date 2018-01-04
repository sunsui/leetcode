package leetcode;

import java.util.Arrays;
//Employee info
class Employee {
 // It's the unique id of each node;
 // unique id of this employee
 public int id;
 // the importance value of this employee
 public int importance;
 // the id of direct subordinates
 public List<Integer> subordinates;
};
class Solution {
	HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();
	public int getImportance(List<Employee> employees, int id) {
		for(Employee e : employees){
			map.put(e.id, e);
		}
		return getSubordinates(id);
    }
	public int getSubordinates(int id) {
		Employee reqe = map.get(id);
		int res = reqe.importance;
		List<Integer> empsubordinates = reqe.subordinates;
		for(Integer i : empsubordinates){
			res += getSubordinates(i);
		}
		return res;
	}
}
