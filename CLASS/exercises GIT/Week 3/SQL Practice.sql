select * from "Employee"; 
select * from "Employee" where "LastName" = 'King';
select * from "Employee" where "FirstName" 'Andrew' and "LastName" 'REPORTSTO is NULL' ;
select * from "Album" order by "Title" desc; 
select * from "first name" from "Customer"order by "city" asc; 
select * "Invoices" where "Billing Adresses" like "T%";
select * from "Invoices" where "Total" between 15 and 50; 
select * from "Employee" where "Hiredate" between '2003 -06-01' and '2004-03-01'; 



INSERT INTO "Genre" ("GenreId", "Name") VALUES (26, N'Latin Trap')
INSERT INTO "Genre" ("GenreId", "Name") VALUES (27, N'Alternative Rock')
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (9, N'Peter', N'Parker',N'Superhero', 1, '03/15/1996', '2012/5/1', N'Null', N'Null', N'Null', N'USA', N'Null', N'Null', N'Null (uNll', N'Null');
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (10, N'Bruce', N'Wayne',N'Superhero', 1, '03/15/1996', '2012/5/1', N'Null', N'Null', N'Null', N'USA', N'Null', N'Null', N'Null (uNll', N'Null');
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company","Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (60, N'Jason', N'Todd', N'Null', N'Null, N'Null', N'null', N'Null', N'Null', N'Null', N'Null', N'Null',N'Null', Null);
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company","Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (61, N'Robin', N'Grayson', N'Null', N'Null, N'Null', N'null', N'Null', N'Null', N'Null', N'Null', N'Null',N'Null', 'Null');
UPDATE "Customer" SET "FirstName" = 'Robert' , "LastName" = 'Walter' where "LastName" = 'Mitchell';
UPDATE"Artist" SET "Name" = 'Creedence Clearwater Revival' where "Name" = "CCR"