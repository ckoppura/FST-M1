REM   Script: Activity4
REM   Activity4 -FST SQL 



ALTER TABLE salesman ADD grade int;

select * from salesman;

update salesman  set grade =100;

select * from salesman;

update salesman set salesman_city  ='Paris' 
where salesman_name ='Nail Knite';

select * from salesman;

