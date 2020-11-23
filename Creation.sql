

/*Tutaj trzeba napisac, ze usuwamy sobie najpierw, tak o*/

IF OBJECT_ID('woodDB.Shipment') IS NOT NULL
BEGIN
	DROP TABLE Shipment
END
GO

IF OBJECT_ID('woodDB.OrderItem') IS NOT NULL
BEGIN
	DROP TABLE OrderItem
END
GO

IF OBJECT_ID('woodDB.Item') IS NOT NULL
BEGIN
	DROP TABLE Item
END
GO

IF OBJECT_ID('woodDB.COrder') IS NOT NULL
BEGIN
	DROP TABLE COrder
END
GO

IF OBJECT_ID('woodDB.Subunit') IS NOT NULL
BEGIN
	DROP TABLE Subunit
END
GO

IF OBJECT_ID('woodDB.Invoice') IS NOT NULL
BEGIN
	DROP TABLE Invoice
END
GO

IF OBJECT_ID('woodDB.Company') IS NOT NULL
BEGIN
	DROP TABLE Company
END
GO

CREATE TABLE woodDB.Company
(	
	CompanyId INT NOT NULL IDENTITY
		CONSTRAINT PK_COMPANY PRIMARY KEY
,
	Company_Name NVARCHAR(40) NOT NULL,
	City NVARCHAR(40) NOT NULL,
	Country NVARCHAR(40) NOT NULL,
	NIP NCHAR(11) NOT NULL
)

CREATE TABLE woodDB.Invoice
(
	InvoiceId INT NOT NULL IDENTITY
		CONSTRAINT PK_INVOICE PRIMARY KEY,
	CompanyId INT NOT NULL
		CONSTRAINT FK_INVOICE_COMPANY FOREIGN KEY
		REFERENCES Company(CompanyId),
	DateStart DATETIME NOT NULL,
	DateEnd DATETIME,
	Netto NVARCHAR(12) NOT NULL,
	Brutto NVARCHAR(12) NOT NULL,
	Tax NCHAR(4) NOT NULL
)

CREATE TABLE woodDB.COrder
(
	OrderId INT NOT NULL IDENTITY
		CONSTRAINT PK_OrderId PRIMARY KEY,
	InvoiceId INT NOT NULL
		CONSTRAINT FK_ORDER_INVOICE FOREIGN KEY
		REFERENCES Invoice(InvoiceId),
	OrderDate DATE NOT NULL,
	Currency_Code NCHAR(3) NOT NULL,
	Discount NVARCHAR(4),
	TotalBrutto NVARCHAR(12) NOT NULL
)

CREATE TABLE woodDB.Item
(
	ItemId INT NOT NULL IDENTITY
		CONSTRAINT PK_ItemId PRIMARY KEY,
	ItemName NVARCHAR(30) NOT NULL,
	ItemDescription NVARCHAR(100),
	Price NCHAR(5) NOT NULL,
	NumberInStock INT NOT NULL
)

CREATE TABLE woodDB.OrderItem
(
	OrderId INT NOT NULL IDENTITY
		CONSTRAINT FK_OrderItem_Order FOREIGN KEY
		REFERENCES COrder(OrderId),
	ItemId INT NOT NULL	
		CONSTRAINT FK_OrderItem_Item FOREIGN KEY
		REFERENCES Item(ItemId),
	Quantity INT NOT NULL
)

CREATE TABLE woodDB.Subunit
(
	SubunitId INT NOT NULL IDENTITY PRIMARY KEY,
	CompanyId INT NOT NULL
		CONSTRAINT FK_Shipment_Company FOREIGN KEY
		REFERENCES Company(CompanyId),
	Country NVARCHAR(40) NOT NULL,
	City NVARCHAR(40) NOT NULL,
	Postcode NVARCHAR(12) NOT NULL,
	Street NVARCHAR(30) NOT NULL
)

CREATE TABLE woodDB.Shipment
(
	ShipmentId INT NOT NULL IDENTITY
		CONSTRAINT PK_Shipment PRIMARY KEY,
	OrderId INT NOT NULL 
		CONSTRAINT FK_Shipment_Order FOREIGN KEY
		REFERENCES COrder(OrderId),
	SubunitId INT NOT NULL 
		CONSTRAINT FK_Shipment_Subunit FOREIGN KEY
		REFERENCES Subunit(SubunitId)
)


INSERT INTO Company(Company_Name, City, Country, NIP) VALUES ('Firma Krzak', 'Warsaw', 'Poland', '13423643129')
INSERT INTO Subunit(CompanyId, Country, City, Postcode, Street) VALUES (1, 'RSA', 'Johannesburg', '2093', 'Wilson Street')
INSERT INTO Subunit(CompanyId, Country, City, Postcode, Street) VALUES (1, 'Australia', 'Sydney', '2001', 'Byng Street')


SELECT c.Company_Name, c.City, c.Country, s.City as [Subunit_City] FROM Company c
JOIN Subunit s ON (c.CompanyId = s.CompanyId)
