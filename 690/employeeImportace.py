"""
# Employee info
class Employee:
    def __init__(self, id, importance, subordinates):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution:
    
    def checkImportance(self, id, m):
        sum = 0
        e = m[id]
        for s in e[1]:
            sum = sum + m[s][0] + self.checkImportance(s, m)
        
        return sum
    
    def getImportance(self, employees, id):
        """
        :type employees: Employee
        :type id: int
        :rtype: int
        """
        m = {}
        
        for e in employees:
            m[e.id] = (e.importance, e.subordinates)
                
        return m[id][0] + self.checkImportance(id, m)
