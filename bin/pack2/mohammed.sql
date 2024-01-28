

CREATE TABLE service(N_service varchar(12),nom varchar(30),lieu varchar(30),constraint cst_pk_nserv primary key (n_service));



insert into service values('10','développement','Daoudiate');
insert into service values('20','commercial','Gueliz');
insert into service values('30','direction','Medina');
insert into service values('40','production','Quartier industriel');



CREATE TABLE Employe (
nom varchar(30),
matricule varchar(12),
fonction varchar(20),
matr_sup varchar(12),
date_embauche date,
salaire INT,
Commission INT,
N_service varchar(12),
constraint cst_pk_mat primary key(matricule),
constraint cst_fk_nserv foreign key (n_service) references service(n_service));



Alter table employe add constraint cst_fk_sup foreign key(matr_sup) references employe(matricule);

---------------- Insertion des lignes dans la table employe

insert into employe values('Jamal','25717','president',NULL,'10-10-1982',50000,NULL,'30');
insert into employe values('Mourad','27047','directeur','25717','10-10-1982',45000,NULL,'20');
insert into employe values('Takoua','24533','directeur','25717','10-10-1982',55000,NULL,'10');
insert into employe values('mohamed','16712','directeur','25717','10-10-1982',40000,null,'30');
insert into employe values('Driss','17547','administratif','16712','10-10-1982',9000,null,'30');
insert into employe values('Dalila','26691','commercial','27047','10-10-1982',25000,25000,'20');
insert into employe values('Leila','25012','administratif','27047','10-10-1982',12000,NULL,'20');
insert into employe values('Abdellah','16034','commercial','27047','10-10-1982',15000,NULL,'20');
insert into employe values('Mohamed','17147','commercial','27047','10-10-1982',20000,500,'20');
insert into employe values('Anas','27546','commercial','27047','10-10-1982',22000,2000,'20');
insert into employe values('Abdelwahed','25935','commercial','27047','10-10-1982',23500,1500,'20');
insert into employe values('Younes','15155','ingenieur','24533','10-10-1982',24000,NULL,'10');
insert into employe values('Sanae','26834','ingenieur','24533','10-10-1982',20000,NULL,'10');
insert into employe values('Mehdi','16278','ingenieur','24533','10-10-1982',21000,NULL,'10');
insert into employe values('Adiba','25067','ingenieur','24533','10-10-1982',30000,NULL,'10');
insert into employe values('Bachir','17232','administratif','24533','10-10-1982',13500,NULL,'10');
insert into employe values('Bouchaib','24831','administratif','16712','10-10-1982',15000,NULL,'30');


commit;
