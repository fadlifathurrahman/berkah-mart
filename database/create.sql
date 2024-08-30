DROP DATABASE IF EXISTS berkahmart;
CREATE DATABASE IF NOT EXISTS berkahmart;
USE berkahmart;

CREATE TABLE akun(
	username 	VARCHAR(36),
	kata_sandi	BLOB
);

CREATE TABLE kategori(
	id_kategori	CHAR (5) PRIMARY KEY,
	kategori_produk	VARCHAR (100)
);

CREATE TABLE distributor(
	id_distributor		CHAR (5) PRIMARY KEY,
	nama_distributor	VARCHAR (100)
);

CREATE TABLE penjualan(
	id_penjualan 		CHAR (5),
	id_produk		CHAR (5),
	nama_produk		VARCHAR(100),
	id_kategori		CHAR (5),
	kategori_produk		VARCHAR(100),
	harga			INT,
	berat_per_pcs		INT,
	satuan_berat_per_pcs	CHAR (10),
	tanggal_produksi	DATE,
	tanggal_kadaluwarsa	DATE,
	tanggal_penjualan	DATE,
	waktu_penjualan		TIME,
	banyak_penjualan	INT,
	total_penjualan		INT,
	PRIMARY KEY (id_penjualan, id_produk),
	FOREIGN KEY (id_kategori) REFERENCES kategori(id_kategori)
);

CREATE TABLE pembelian(
	id_pembelian		CHAR (5),
	id_produk		CHAR (5),
	nama_produk		VARCHAR(100),
	id_kategori		CHAR (5),
	kategori_produk		VARCHAR(100),
	harga			INT,
	berat_per_pcs		INT,
	satuan_berat_per_pcs	CHAR (10),
	id_distributor		CHAR (5),
	nama_distributor	VARCHAR(100),
	tanggal_produksi	DATE,
	tanggal_kadaluwarsa	DATE,
	tanggal_pembelian	DATE,
	waktu_pembelian		TIME,
	banyak_pembelian	INT,
	total_pembelian		INT,
	PRIMARY KEY (id_pembelian, id_produk),
	FOREIGN KEY (id_kategori) REFERENCES kategori(id_kategori),
	FOREIGN KEY (id_distributor) REFERENCES distributor(id_distributor)
);

CREATE TABLE produk(
	id_produk		CHAR (5),
	nama_produk 		VARCHAR (100),
	id_kategori		CHAR (5),
	kategori_produk		VARCHAR(100),
	harga			INT,
	berat_per_pcs		INT,
	satuan_berat_per_pcs	CHAR (10),
	tanggal_produksi	DATE,
	tanggal_kadaluwarsa	DATE, 
	sisa_stok		INT
);