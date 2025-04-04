DROP TABLE IF EXISTS PRICES;

CREATE TABLE PRICES (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	BRAND_ID INT NOT NULL, 
	START_DATE DATETIME NOT NULL, 
	END_DATE DATETIME NOT NULL, 
	PRICE_LIST INT NOT NULL, 
	PRODUCT_ID INT NOT NULL, 
	PRIORITY INT NOT NULL, 
	PRICE DECIMAL(10,2) NOT NULL, 
	CURR CHARACTER VARYING(5) NOT NULL
);