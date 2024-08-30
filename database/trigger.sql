USE berkahmart;

/* trigger tambah pembelian */
DELIMITER $$
CREATE TRIGGER tambah_stok
AFTER INSERT
ON pembelian
FOR EACH ROW BEGIN
	UPDATE produk pr
        INNER JOIN pembelian pb ON pr.id_produk = pb.id_produk
	SET pr.sisa_stok = pr.sisa_stok + pb.banyak_pembelian
	WHERE pr.id_produk = pb.id_produk;
	
END;
$$
DELIMITER;

/* trigger kurang penjualan */
DELIMITER $$
CREATE TRIGGER kurang_stok
AFTER INSERT
ON penjualan
FOR EACH ROW BEGIN
	UPDATE produk pr
        INNER JOIN penjualan pj ON pr.id_produk = pj.id_produk
	SET pr.sisa_stok = pr.sisa_stok - pj.banyak_penjualan
	WHERE pr.id_produk = pj.id_produk;
END;
$$
DELIMITER;

/* trigger delete produk */
DELIMITER $$
CREATE TRIGGER delete_produk
BEFORE DELETE
ON produk
FOR EACH ROW BEGIN
	UPDATE pembelian pb
        INNER JOIN produk kt ON pb.id_produk = kt.id_produk
	SET pb.nama_produk = "produk dihapus", pb.id_produk = "00000"
	WHERE pb.id_produk= kt.id_produk;
	
	UPDATE penjualan pj
        INNER JOIN produk kt ON pj.id_produk = kt.id_produk
	SET pj.nama_produk = "produk dihapus", pj.id_produk = "00000"
	WHERE pj.id_produk = kt.id_produk;	
	
	UPDATE produk pr
        INNER JOIN produk kt ON pr.id_produk= kt.id_produk
	SET pr.nama_produk = "produk dihapus", pr.id_produk = "00000"
	WHERE pr.id_produk = kt.id_produk;
END;
$$
DELIMITER;

/* trigger delete distributor */
DELIMITER $$
CREATE TRIGGER delete_distributor
BEFORE DELETE
ON distributor
FOR EACH ROW BEGIN
	UPDATE pembelian pb
        INNER JOIN distributor db ON pb.id_distributor = db.id_distributor
	SET pb.nama_distributor= "distributor dihapus", pb.id_distributor = "00000"
	WHERE pb.id_distributor = db.id_distributor;
END;
$$
DELIMITER;

/* trigger delete kategori */
DELIMITER $$
CREATE TRIGGER delete_kategori
BEFORE DELETE
ON kategori
FOR EACH ROW BEGIN
	UPDATE pembelian pb
        INNER JOIN kategori kt ON pb.id_kategori = kt.id_kategori
	SET pb.kategori_produk = "kategori dihapus", pb.id_kategori = "00000"
	WHERE pb.id_kategori = kt.id_kategori;
	
	UPDATE penjualan pj
        INNER JOIN kategori kt ON pj.id_kategori = kt.id_kategori
	SET pj.kategori_produk = "kategori dihapus", pj.id_kategori = "00000"
	WHERE pj.id_kategori = kt.id_kategori;	
	
	UPDATE produk pr
        INNER JOIN kategori kt ON pr.id_kategori= kt.id_kategori
	SET pr.kategori_produk = "kategori dihapus", pr.id_kategori = "00000"
	WHERE pr.id_kategori = kt.id_kategori;
END;
$$
DELIMITER;