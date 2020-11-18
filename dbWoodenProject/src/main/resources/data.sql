insert into company(id, company_name, city, country, nip) VALUES ('0', 'Test Comapany 0', 'Test City 4', 'Test Country 0', 043216923);
insert into company(id, company_name, city, country, nip) VALUES ('1', 'Test Comapany 1', 'Test City 3', 'Test Country 1', 143216923);
insert into company(id, company_name, city, country, nip) VALUES ('2', 'Test Comapany 2', 'Test City 2', 'Test Country 0', 243216923);
insert into company(id, company_name, city, country, nip) VALUES ('3', 'Test Comapany 3', 'Test City 1', 'Test Country 1', 343216923);
insert into company(id, company_name, city, country, nip) VALUES ('4', 'Test Comapany 4', 'Test City 0', 'Test Country 0', 443216923);
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('0', '0', '2018-02-18', '2020-08-06' ,  '0', '0.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('1', '1', '2018-02-19', '2020-08-07' ,  '1', '1.25', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('2', '2', '2018-02-20', '2020-08-08' ,  '4', '5.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('3', '3', '2018-02-21', '2020-08-09' ,  '3', '3.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('5', '0', '2018-02-23', '2020-08-11' ,  '7', '8.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('4', '4', '2018-02-22', '2020-08-10' ,  '4', '5.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('6', '1', '2018-02-24', '2020-08-12' ,  '8', '10.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('7', '2', '2018-02-25', '2020-08-13' ,  '7', '8.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('8', '3', '2018-02-26', '2020-08-14' ,  '13', '16.25', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('9', '4', '2018-02-27', '2020-08-15' ,  '9', '11.25', '0.25' );


SET IDENTITY_INSERT COMPANY OFF