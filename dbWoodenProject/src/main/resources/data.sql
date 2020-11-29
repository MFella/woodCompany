insert into company(id, company_name, city, country, nip) VALUES ('0', 'Test Comapany 0', 'Test City 4', 'Test Country 0', 043216923);
insert into company(id, company_name, city, country, nip) VALUES ('1', 'Test Comapany 1', 'Test City 3', 'Test Country 1', 143216923);
insert into company(id, company_name, city, country, nip) VALUES ('2', 'Test Comapany 2', 'Test City 2', 'Test Country 0', 243216923);
insert into company(id, company_name, city, country, nip) VALUES ('3', 'Test Comapany 3', 'Test City 1', 'Test Country 1', 343216923);
insert into company(id, company_name, city, country, nip) VALUES ('4', 'Test Comapany 4', 'Test City 0', 'Test Country 0', 443216923);
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('0', '0', '2018-02-22', '2020-11-18' ,  '0', '0.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('1', '1', '2018-02-23', '2020-11-09' ,  '1', '1.25', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('2', '2', '2018-02-24', '2020-10-31' ,  '4', '5.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('3', '3', '2018-02-25', '2020-10-22' ,  '3', '3.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('4', '4', '2018-02-26', '2020-10-13' ,  '4', '5.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('5', '0', '2018-02-27', '2020-10-04' ,  '7', '8.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('6', '1', '2018-02-28', '2020-09-25' ,  '8', '10.00', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('7', '2', '2018-03-01', '2020-09-16' ,  '7', '8.75', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('8', '3', '2018-03-02', '2020-09-07' ,  '13', '16.25', '0.25' );
insert into invoice(id, company_id, date_start, date_end, netto, brutto, tax) values ('9', '4', '2018-03-03', '2020-08-29' ,  '9', '11.25', '0.25' );
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('0', '0', '2020-11-20',  '1.00', 'EUR', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('1', '1', '2020-11-11',  '0.89', 'GBP', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('2', '2', '2020-11-02',  '4.46', 'PLN', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('3', '3', '2020-10-24',  '1.18', 'USD', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('4', '4', '2020-10-15',  '1.08', 'CHF', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('5', '5', '2020-10-06',  '1.00', 'EUR', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('6', '6', '2020-09-27',  '0.89', 'GBP', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('7', '7', '2020-09-18',  '4.46', 'PLN', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('8', '8', '2020-09-09',  '1.18', 'USD', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('9', '9', '2020-08-31',  '1.08', 'CHF', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('10', '0', '2020-08-22',  '1.00', 'EUR', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('11', '1', '2020-08-13',  '0.89', 'GBP', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('12', '2', '2020-08-04',  '4.46', 'PLN', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('13', '3', '2020-07-26',  '1.18', 'USD', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('14', '4', '2020-07-17',  '1.08', 'CHF', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('15', '5', '2020-07-08',  '1.00', 'EUR', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('16', '6', '2020-06-29',  '0.89', 'GBP', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('17', '7', '2020-06-20',  '4.46', 'PLN', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('18', '8', '2020-06-11',  '1.18', 'USD', '0', '1000');
insert into corder(id, invoice_id, order_date, currency, currency_code, discount, total_brutto) values ('19', '9', '2020-06-02',  '1.08', 'CHF', '0', '1000');
insert into item(id, name, description, price, number_in_stock) values ('0', 'Produkt Name 0', 'Dummy description 0', '0', '303');
insert into item(id, name, description, price, number_in_stock) values ('1', 'Produkt Name 1', 'Dummy description 1', '2', '143');
insert into item(id, name, description, price, number_in_stock) values ('2', 'Produkt Name 2', 'Dummy description 2', '6', '393');
insert into item(id, name, description, price, number_in_stock) values ('3', 'Produkt Name 3', 'Dummy description 3', '12', '637');
insert into item(id, name, description, price, number_in_stock) values ('4', 'Produkt Name 4', 'Dummy description 4', '20', '671');
insert into item(id, name, description, price, number_in_stock) values ('5', 'Produkt Name 5', 'Dummy description 5', '30', '64');
insert into item(id, name, description, price, number_in_stock) values ('6', 'Produkt Name 6', 'Dummy description 6', '42', '633');
insert into item(id, name, description, price, number_in_stock) values ('7', 'Produkt Name 7', 'Dummy description 7', '56', '405');
insert into item(id, name, description, price, number_in_stock) values ('8', 'Produkt Name 8', 'Dummy description 8', '72', '274');
insert into item(id, name, description, price, number_in_stock) values ('9', 'Produkt Name 9', 'Dummy description 9', '90', '102');
insert into item(id, name, description, price, number_in_stock) values ('10', 'Produkt Name 10', 'Dummy description 10', '110', '88');
insert into item(id, name, description, price, number_in_stock) values ('11', 'Produkt Name 11', 'Dummy description 11', '132', '636');
insert into item(id, name, description, price, number_in_stock) values ('12', 'Produkt Name 12', 'Dummy description 12', '156', '162');
insert into item(id, name, description, price, number_in_stock) values ('13', 'Produkt Name 13', 'Dummy description 13', '182', '454');
insert into item(id, name, description, price, number_in_stock) values ('14', 'Produkt Name 14', 'Dummy description 14', '210', '297');
insert into item(id, name, description, price, number_in_stock) values ('15', 'Produkt Name 15', 'Dummy description 15', '240', '528');
insert into item(id, name, description, price, number_in_stock) values ('16', 'Produkt Name 16', 'Dummy description 16', '272', '18');
insert into item(id, name, description, price, number_in_stock) values ('17', 'Produkt Name 17', 'Dummy description 17', '306', '493');
insert into item(id, name, description, price, number_in_stock) values ('18', 'Produkt Name 18', 'Dummy description 18', '342', '883');
insert into item(id, name, description, price, number_in_stock) values ('19', 'Produkt Name 19', 'Dummy description 19', '380', '727');
insert into orderitem(id, order_id, item_id, quantity) values  ('0', '0', '0', '0');
insert into orderitem(id, order_id, item_id, quantity) values  ('1', '1', '1', '1');
insert into orderitem(id, order_id, item_id, quantity) values  ('2', '2', '2', '2');
insert into orderitem(id, order_id, item_id, quantity) values  ('3', '3', '3', '3');
insert into orderitem(id, order_id, item_id, quantity) values  ('4', '4', '4', '4');
insert into orderitem(id, order_id, item_id, quantity) values  ('5', '5', '5', '5');
insert into orderitem(id, order_id, item_id, quantity) values  ('6', '6', '6', '6');
insert into orderitem(id, order_id, item_id, quantity) values  ('7', '7', '7', '7');
insert into orderitem(id, order_id, item_id, quantity) values  ('8', '8', '8', '8');
insert into orderitem(id, order_id, item_id, quantity) values  ('9', '9', '9', '9');
insert into orderitem(id, order_id, item_id, quantity) values  ('10', '10', '10', '10');
insert into orderitem(id, order_id, item_id, quantity) values  ('11', '11', '11', '11');
insert into orderitem(id, order_id, item_id, quantity) values  ('12', '12', '12', '12');
insert into orderitem(id, order_id, item_id, quantity) values  ('13', '13', '13', '13');
insert into orderitem(id, order_id, item_id, quantity) values  ('14', '14', '14', '14');
insert into orderitem(id, order_id, item_id, quantity) values  ('15', '15', '15', '15');
insert into orderitem(id, order_id, item_id, quantity) values  ('16', '16', '16', '16');
insert into orderitem(id, order_id, item_id, quantity) values  ('17', '17', '17', '17');
insert into orderitem(id, order_id, item_id, quantity) values  ('18', '18', '18', '18');
insert into orderitem(id, order_id, item_id, quantity) values  ('19', '19', '19', '19');
insert into orderitem(id, order_id, item_id, quantity) values  ('20', '0', '0', '20');
insert into orderitem(id, order_id, item_id, quantity) values  ('21', '1', '1', '21');
insert into orderitem(id, order_id, item_id, quantity) values  ('22', '2', '2', '22');
insert into orderitem(id, order_id, item_id, quantity) values  ('23', '3', '3', '23');
insert into orderitem(id, order_id, item_id, quantity) values  ('24', '4', '4', '24');
insert into orderitem(id, order_id, item_id, quantity) values  ('25', '5', '5', '25');
insert into orderitem(id, order_id, item_id, quantity) values  ('26', '6', '6', '26');
insert into orderitem(id, order_id, item_id, quantity) values  ('27', '7', '7', '27');
insert into orderitem(id, order_id, item_id, quantity) values  ('28', '8', '8', '28');
insert into orderitem(id, order_id, item_id, quantity) values  ('29', '9', '9', '29');
insert into orderitem(id, order_id, item_id, quantity) values  ('30', '10', '10', '30');
insert into orderitem(id, order_id, item_id, quantity) values  ('31', '11', '11', '31');
insert into orderitem(id, order_id, item_id, quantity) values  ('32', '12', '12', '32');
insert into orderitem(id, order_id, item_id, quantity) values  ('33', '13', '13', '33');
insert into orderitem(id, order_id, item_id, quantity) values  ('34', '14', '14', '34');
insert into orderitem(id, order_id, item_id, quantity) values  ('35', '15', '15', '35');
insert into orderitem(id, order_id, item_id, quantity) values  ('36', '16', '16', '36');
insert into orderitem(id, order_id, item_id, quantity) values  ('37', '17', '17', '37');
insert into orderitem(id, order_id, item_id, quantity) values  ('38', '18', '18', '38');
insert into orderitem(id, order_id, item_id, quantity) values  ('39', '19', '19', '39');
insert into subunit(id, company_id, country, city, postcode, street) values ('0', '0', 'Poland', 'Warsaw', '00-003', 'Mickiewicza 40');
insert into subunit(id, company_id, country, city, postcode, street) values ('1', '1', 'Poland', 'Cracow', '30-038', 'Mickiewicza 41');
insert into subunit(id, company_id, country, city, postcode, street) values ('2', '2', 'Poland', 'Zielona Gora', '65-031', 'Mickiewicza 42');
insert into subunit(id, company_id, country, city, postcode, street) values ('3', '3', 'Poland', 'Gdansk', '80-000', 'Mickiewicza 43');
insert into subunit(id, company_id, country, city, postcode, street) values ('4', '4', 'Poland', 'Zakopane', '34-505', 'Mickiewicza 44');
insert into subunit(id, company_id, country, city, postcode, street) values ('5', '0', 'Poland', 'Warsaw', '00-003', 'Mickiewicza 45');
insert into subunit(id, company_id, country, city, postcode, street) values ('6', '1', 'Poland', 'Cracow', '30-038', 'Mickiewicza 46');
insert into subunit(id, company_id, country, city, postcode, street) values ('7', '2', 'Poland', 'Zielona Gora', '65-031', 'Mickiewicza 47');
insert into subunit(id, company_id, country, city, postcode, street) values ('8', '3', 'Poland', 'Gdansk', '80-000', 'Mickiewicza 48');
insert into subunit(id, company_id, country, city, postcode, street) values ('9', '4', 'Poland', 'Zakopane', '34-505', 'Mickiewicza 49');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('0', '0', '0', '15', 'Inpost', '2020-11-18');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('1', '1', '1', '18', 'Registered', '2020-11-15');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('2', '2', '2', '28', 'Inpost', '2020-11-12');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('3', '3', '3', '16', 'Priority', '2020-11-09');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('4', '4', '4', '15', 'Registered', '2020-11-06');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('5', '5', '5', '12', 'Economic', '2020-11-03');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('6', '6', '6', '12', 'Inpost', '2020-10-31');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('7', '7', '7', '10', 'Registered', '2020-10-28');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('8', '8', '8', '26', 'Registered', '2020-10-25');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('9', '9', '9', '25', 'Economic', '2020-10-22');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('10', '0', '10', '12', 'Inpost', '2020-10-19');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('11', '1', '11', '27', 'Economic', '2020-10-16');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('12', '2', '12', '19', 'Priority', '2020-10-13');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('13', '3', '13', '19', 'Priority', '2020-10-10');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('14', '4', '14', '25', 'Registered', '2020-10-07');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('15', '5', '15', '26', 'Priority', '2020-10-04');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('16', '6', '16', '17', 'Inpost', '2020-10-01');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('17', '7', '17', '17', 'Registered', '2020-09-28');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('18', '8', '18', '29', 'Priority', '2020-09-25');
insert into shipment(id, subunit_id, order_id, delivery_cost, delivery_type, delivery_date) values ('19', '9', '19', '19', 'Registered', '2020-09-22');


-- Creations of needed procedures
CREATE PROCEDURE update_totals
AS
BEGIN
	DECLARE @cId as FLOAT
	DECLARE @corderId as INT = 0
	DECLARE @msg varchar(max)
	DECLARE @bc as CURSOR

	SET @bc = CURSOR FOR
	SELECT (CAST(oi.Quantity AS float)* CAST(i.price as float)* CAST(c.currency as float) + CAST(s.delivery_cost as float))
	FROM CORDER c
	JOIN ORDERITEM oi ON (c.id = oi.order_id)
	JOIN ITEM i ON (i.id = oi.item_id)
	JOIN SHIPMENT s ON (s.order_id = c.id)

	OPEN @bc
		FETCH NEXT FROM @bc INTO @cId
		WHILE @@FETCH_STATUS = 0
			BEGIN
				UPDATE CORDER
				SET total_brutto = @cId
				WHERE id = @corderId
				print @cId

				SET @corderId = @corderId + 1
			FETCH NEXT FROM @bc INTO @cId
	END
END


SET IDENTITY_INSERT COMPANY OFF

EXEC update_totals


--Another procedure => check if NIP is appropriate
--CREATE FUNCTION is_valid_nip ( @nip nvarchar(15) )
--RETURNS bit
--AS
--BEGIN
--
--    SELECT @nip = REPLACE(@nip, '-', '')
--
--    IF ISNUMERIC(@nip) = 0
--        RETURN 0
--
--    DECLARE
--        @weights AS TABLE
--        (
--            Position tinyint IDENTITY(1,1) NOT NULL,
--            Weight tinyint NOT NULL
--        )
--    INSERT INTO @weights VALUES(6), (5), (7), (2), (3), (4), (5), (6), (7)
--
--    IF SUBSTRING(@nip, 10, 1) = (SELECT SUM(CONVERT(TINYINT, SUBSTRING(@nip, Position, 1)) * Weight)% 11 FROM @weights)
--        RETURN 1
--
--    RETURN 0
--END
