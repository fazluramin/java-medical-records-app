-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2015 at 12:58 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rekam_medis`
--

-- --------------------------------------------------------

--
-- Table structure for table `previlledge`
--

CREATE TABLE IF NOT EXISTS `previlledge` (
`id_tipe` int(11) NOT NULL,
  `akses` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `previlledge`
--

INSERT INTO `previlledge` (`id_tipe`, `akses`) VALUES
(1, 'admin'),
(2, 'user'),
(99, 'super_admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_diagnosa`
--

CREATE TABLE IF NOT EXISTS `tb_diagnosa` (
  `no_data` varchar(15) NOT NULL,
  `id_pasien` varchar(15) NOT NULL,
  `id_dokter` varchar(10) NOT NULL,
  `penyakit` varchar(30) NOT NULL,
  `data_diagnosa` varchar(200) NOT NULL,
  `data_labor` varchar(200) NOT NULL,
  `tanggal_cek` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_diagnosa`
--

INSERT INTO `tb_diagnosa` (`no_data`, `id_pasien`, `id_dokter`, `penyakit`, `data_diagnosa`, `data_labor`, `tanggal_cek`) VALUES
('DT-001', 'P-001', 'DR-01', 'Penyakit Hati', 'Terkena Lever', 'Belum diketahui', '2021-08-10');

-- --------------------------------------------------------

--
-- Table structure for table `tb_dokter`
--

CREATE TABLE IF NOT EXISTS `tb_dokter` (
  `id_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `umur` int(3) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `spesialisasi` varchar(30) NOT NULL,
  `alamat` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_dokter`
--

INSERT INTO `tb_dokter` (`id_dokter`, `nama_dokter`, `jenis_kelamin`, `umur`, `agama`, `spesialisasi`, `alamat`) VALUES
('DR-01', 'Fazlur Rahman', 'pria', 21, 'Islam', 'Penyakit Hati', 'Pekanbaru Arengka'),
('DR-02', 'Chevalots Rora', 'pria', 23, 'Islam', 'Penyakit Ginjal', 'Jakarta Selatan'),
('DR-03', 'Spas Amin', 'Pria', 22, 'Islam', 'Penyakit Mata', 'Pekanbaru Arengka'),
('DR-04', 'Petruk Situmorang', 'Pria', 35, 'Islam', 'Penyakit Kulit', 'Pekanbaru Riau');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pasien`
--

CREATE TABLE IF NOT EXISTS `tb_pasien` (
  `id_pasien` varchar(15) NOT NULL,
  `nama_pasien` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `umur` int(3) NOT NULL,
  `pekerjaan` varchar(30) NOT NULL,
  `alamat` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pasien`
--

INSERT INTO `tb_pasien` (`id_pasien`, `nama_pasien`, `jenis_kelamin`, `agama`, `umur`, `pekerjaan`, `alamat`) VALUES
('P-001', 'Abimayu Sentosa', 'Pria', 'Kristen', 56, 'Pensiun', 'Pekanbaru riau'),
('P-002', 'Sutrisna Pengabean', 'Pria', 'Islam', 29, 'Wiraswasta', 'Pekanbaru Riau'),
('P-003', 'Maestri Purnama', 'Wanita', 'Islam', 40, 'Wiraswasta', 'Pekanbaru Riau'),
('P-004', 'Fadhlan Alkempo', 'Pria', 'Islam', 43, 'Pegawai Negeri Sipil', 'Pekanbaru Riau');

-- --------------------------------------------------------

--
-- Table structure for table `tb_perawat`
--

CREATE TABLE IF NOT EXISTS `tb_perawat` (
  `id_perawat` varchar(15) NOT NULL,
  `nama_perawat` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `umur` int(3) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `alamat` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_perawat`
--

INSERT INTO `tb_perawat` (`id_perawat`, `nama_perawat`, `jenis_kelamin`, `umur`, `agama`, `alamat`) VALUES
('MD-001', 'Sisca Nerobi', 'Wanita', 24, 'Islam', 'Pekanbaru Riau'),
('MD-002', 'Geovanny Alfred', 'Wanita', 21, 'Islam', 'Pekanbaru Riau'),
('MD-003', 'Fransisca Tobi', 'Wanita', 25, 'Katolik', 'Pekanbaru Riau'),
('MD-004', 'Fanny Pratiwi', 'Wanita', 22, 'Islam', 'Padang Sumatera Barat'),
('MD-005', 'Diksa Harsa Fadilah', 'Pria', 23, 'Islam', 'Pasaman Sumatera Barat'),
('MD-006', 'Susilo Herka Madi', 'Pria', 26, 'Islam', 'Pekanbaru Riau'),
('MD-007', 'Fratus Eduardo', 'Pria', 33, 'Katolik', 'Pekanbaru Riau');

-- --------------------------------------------------------

--
-- Table structure for table `tb_rekam`
--

CREATE TABLE IF NOT EXISTS `tb_rekam` (
  `no_rekam` varchar(20) NOT NULL,
  `id_pasien` varchar(15) NOT NULL,
  `id_dokter` varchar(10) NOT NULL,
  `id_perawat` varchar(15) NOT NULL,
  `id_ruang` varchar(10) NOT NULL,
  `penyakit` varchar(20) NOT NULL,
  `resep` varchar(20) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `tanggal_keluar` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_rekam`
--

INSERT INTO `tb_rekam` (`no_rekam`, `id_pasien`, `id_dokter`, `id_perawat`, `id_ruang`, `penyakit`, `resep`, `tanggal_masuk`, `tanggal_keluar`) VALUES
('DOC-001', 'P-002', 'DR-04', 'MD-003', 'R-02', 'Cacar Air', '-', '2015-10-20', '2015-10-21'),
('DOC-002', 'P-003', 'DR-02', 'MD-002', 'R-03', 'Transplantasi Ginjal', '-', '2015-02-20', '2015-02-25'),
('DOC-003', 'P-004', 'DR-03', 'MD-002', 'R-03', 'Katarak Akut', '-', '2015-02-10', '2015-02-20'),
('DOC-004', 'P-001', 'DR-03', 'MD-003', 'R-03', 'Rabun Mata Akut', '-', '2015-05-05', '2015-05-06');

-- --------------------------------------------------------

--
-- Table structure for table `tb_ruang`
--

CREATE TABLE IF NOT EXISTS `tb_ruang` (
  `id_ruang` varchar(10) NOT NULL,
  `nama_ruang` varchar(20) NOT NULL,
  `kelas_ruang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_ruang`
--

INSERT INTO `tb_ruang` (`id_ruang`, `nama_ruang`, `kelas_ruang`) VALUES
('R-01', 'Ruang Mawar', 'Biasa'),
('R-02', 'Ruang Melati', 'VIP'),
('R-03', 'Ruang Anggrek', 'VVIP'),
('R-04', 'Ruang Cempaka', 'VIP');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id_user` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `id_tipe` int(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `id_tipe`) VALUES
(1, 'admin', 'admin', 1),
(2, 'papas', 'papas', 2),
(3, 'superadmin', 'superadmin', 99);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `previlledge`
--
ALTER TABLE `previlledge`
 ADD PRIMARY KEY (`id_tipe`);

--
-- Indexes for table `tb_diagnosa`
--
ALTER TABLE `tb_diagnosa`
 ADD PRIMARY KEY (`no_data`);

--
-- Indexes for table `tb_dokter`
--
ALTER TABLE `tb_dokter`
 ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `tb_pasien`
--
ALTER TABLE `tb_pasien`
 ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `tb_perawat`
--
ALTER TABLE `tb_perawat`
 ADD PRIMARY KEY (`id_perawat`);

--
-- Indexes for table `tb_rekam`
--
ALTER TABLE `tb_rekam`
 ADD PRIMARY KEY (`no_rekam`);

--
-- Indexes for table `tb_ruang`
--
ALTER TABLE `tb_ruang`
 ADD PRIMARY KEY (`id_ruang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `previlledge`
--
ALTER TABLE `previlledge`
MODIFY `id_tipe` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=100;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
