REM   Script: Activity7
REM   Activity7

select e.empno , e.ename ,m.mgr, m.ename as "mgr name" 
from scott.emp e , scott.emp m 
where e.mgr =m.empno;

select * from scott.emp;

select e.empno , e.ename ,m.mgr, m.ename as "mgr name" 
from scott.emp e , scott.emp m 
where e.mgr =m.empno;

select * from scott.emp;

select sum(purchase_amount) from orders;

select sum(purchase_amount) as "total" from orders;

select avg(purchase_amount) as "avg" from orders;


select MAX(purchase_amount) AS "Maximum" from orders;

select min(purchase_amount) as min from orders;

select COUNT(distinct salesman_id) AS "count" from orders;

