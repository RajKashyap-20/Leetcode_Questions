# Write your MySQL query statement below
SELECT Employee.name as name, Bonus.bonus as bonus 
from Employee Left join Bonus ON Employee.empID=Bonus.empID
Where bonus <1000 OR Bonus IS null;