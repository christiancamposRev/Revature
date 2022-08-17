select * from "Employee"; 
select * from "Employee" where "LastName" = 'King';
select * from "Employee" where  "FirstName" = 'Andrew' and "ReportsTo" is Null;
select * from "Album" order by "Title" desc; 
select "FirstName" from "Customer" order by "City" asc; 
select * from "Invoice" where "BillingAddress" like 'T%';
select * from "Invoice" where "Total" between 15 and 50; 
select * from "Employee" where "HireDate" between '2003-06-01' and '2004-03-01'; 



insert into "Genre" ("GenreId", "Name") values (26, N'Latin Trap');
insert into "Genre" ("GenreId", "Name") values (27, N'Alternative Rock');

insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (9, N'Peter', N'Parker',N'Superhero', 1, '03/15/1996', '2012/5/1', N'Null', N'Null', N'Null', N'USA', N'Null', N'Null', N'Null (uNll', N'Null');
insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (10, N'Bruce', N'Wayne',N'Superhero', 1, '03/15/1996', '2012/5/1', N'Null', N'Null', N'Null', N'USA', N'Null', N'Null', N'Null (uNll', N'Null');

insert into "Customer" ("CustomerId", "FirstName", "LastName", "Company","Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (60, N'Saul', N'Goodman',N'Null',N'Null', N'Null', N'Null', N'Null', N'Null', N'Null', N'Null', N'Null',6)

insert into "Customer" ("CustomerId", "FirstName", "LastName", "Company","Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (61, N'Gus', N'Fring', N'Null',N'Null', N'Null', N'Null', N'Null', N'Null', N'Null', N'Null', N'Null',6)

UPDATE "Customer" SET "FirstName" = 'Robert' , "LastName" = 'Walter' where "LastName" = 'Mitchell';
UPDATE"Artist" SET "Name" = 'Creedence Clearwater Revival' where "Name" = 'CCR'