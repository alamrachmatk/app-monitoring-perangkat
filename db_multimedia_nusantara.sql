-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2020 at 09:14 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_multimedia_nusantara`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_barang`
--

CREATE TABLE `t_barang` (
  `kd_barang` varchar(25) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `kategori_brg` varchar(50) NOT NULL,
  `stok` int(25) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_barang`
--

INSERT INTO `t_barang` (`kd_barang`, `nama_barang`, `kategori_brg`, `stok`, `keterangan`) VALUES
('B001', 'Kunci Pas 12-13 ring', 'Tools Set', 45, '-'),
('B002', 'Prodelin', 'Antena', 45, '-'),
('B003', 'Modem H50', 'Modem', 35, '-'),
('004', 'Antena 90', 'Antena', 50, '-');

-- --------------------------------------------------------

--
-- Table structure for table `t_detailpem`
--

CREATE TABLE `t_detailpem` (
  `kd_detpem` int(15) NOT NULL,
  `kd_pemasukan` varchar(25) NOT NULL,
  `kd_barang` varchar(25) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `kuantitas` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_detailpem`
--

INSERT INTO `t_detailpem` (`kd_detpem`, `kd_pemasukan`, `kd_barang`, `nama_barang`, `kuantitas`) VALUES
(1, 'PEM', 'B001', 'Kunci Pas 12-13 ring', 28),
(2, 'PEM', 'B002', 'Prodelin', 45),
(3, 'PEM2', 'B003', 'Modem H50', 30),
(4, 'PEM3', 'B001', 'Kunci Pas 12-13 ring', 2),
(5, 'PEM4', 'B001', 'Kunci Pas 12-13 ring', 3),
(1, 'PEM4', 'B001', 'Kunci Pas 12-13 ring', 5),
(1, 'PEM5', 'B003', 'Modem H50', 5),
(2, 'PEM6', 'B001', 'Kunci Pas 12-13 ring', 5),
(3, 'PEM7', 'B001', 'Kunci Pas 12-13 ring', 5),
(4, 'PEM8', 'B003', 'Modem H50', 5),
(5, 'PEM9', 'B002', 'Prodelin', 5),
(6, 'PEM10', 'B001', 'Kunci Pas 12-13 ring', 5),
(7, 'PEM11', 'B003', 'Modem H50', 5),
(8, 'PEM11', 'B001', 'Kunci Pas 12-13 ring', 4),
(9, 'PEM12', 'B001', 'Kunci Pas 12-13 ring', 5),
(10, 'PEM13', 'B001', 'Kunci Pas 12-13 ring', 5),
(11, 'PEM14', 'B003', 'Modem H50', 5),
(1, 'PEM5', '004', 'Antena 90', 50);

-- --------------------------------------------------------

--
-- Table structure for table `t_detailpemtemp`
--

CREATE TABLE `t_detailpemtemp` (
  `kd_detpemtemp` int(15) NOT NULL,
  `kd_barangtemp` varchar(25) NOT NULL,
  `nama_barangtemp` varchar(50) NOT NULL,
  `kuantitas` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_detailpeng`
--

CREATE TABLE `t_detailpeng` (
  `kd_detpeng` int(15) NOT NULL,
  `kd_pengeluaran` varchar(25) NOT NULL,
  `kd_barang` varchar(25) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `kuantitas` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_detailpeng`
--

INSERT INTO `t_detailpeng` (`kd_detpeng`, `kd_pengeluaran`, `kd_barang`, `nama_barang`, `kuantitas`) VALUES
(1, 'PNG1', 'B001', 'Kunci Pas 12-13 ring', 3),
(2, 'PNG1', 'B002', 'Prodelin', 2),
(3, 'PNG2', 'B002', 'Prodelin', 3),
(1, 'PNG3', 'B001', 'Kunci Pas 12-13 ring', 5),
(2, 'PNG4', 'B001', 'Kunci Pas 12-13 ring', 5),
(3, 'PNG5', 'B001', 'Kunci Pas 12-13 ring', 9),
(4, 'PNG3', 'B003', 'Modem H50', 10),
(1, 'PNG7', 'B003', 'Modem H50', 5);

-- --------------------------------------------------------

--
-- Table structure for table `t_detailpengtemp`
--

CREATE TABLE `t_detailpengtemp` (
  `kd_detpengtemp` int(15) NOT NULL,
  `kd_barangtemp` varchar(25) NOT NULL,
  `nama_barangtemp` varchar(50) NOT NULL,
  `kuantitas` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_pabrik`
--

CREATE TABLE `t_pabrik` (
  `kd_pabrik` varchar(25) NOT NULL,
  `nama_pbrk` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `telepon` varchar(50) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pabrik`
--

INSERT INTO `t_pabrik` (`kd_pabrik`, `nama_pbrk`, `alamat`, `telepon`, `keterangan`) VALUES
('V001', 'Aslimindo', 'Jalan peninggaran 1', '0217453674', '-'),
('V002', 'Selindo', 'Jalan bendi utama 2', '0217564738', '-'),
('V003', 'M2M', 'JL. Sisingamaraja', '02177645', '-');

-- --------------------------------------------------------

--
-- Table structure for table `t_pelanggan`
--

CREATE TABLE `t_pelanggan` (
  `kd_pelanggan` varchar(25) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `nama_plngn` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telepon` varchar(50) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pelanggan`
--

INSERT INTO `t_pelanggan` (`kd_pelanggan`, `kategori`, `nama_plngn`, `alamat`, `telepon`, `keterangan`) VALUES
('C001', 'Daerah', 'Cabang Jakarta', 'Jalan kasturi 2 no 9', '0217463820', '-'),
('C002', 'Daerah', 'Cabang Bogor', 'Jalan nam nam 12 no 1', '0217433456', '-'),
('C003', 'Daerah', 'Cabang Medan', 'Jalan grendee 9 no 7', '0217433444', '-');

-- --------------------------------------------------------

--
-- Table structure for table `t_pem`
--

CREATE TABLE `t_pem` (
  `id` int(25) NOT NULL,
  `kd_pemasukan` varchar(25) NOT NULL,
  `kd_pabrik` varchar(25) NOT NULL,
  `nama_pbrk` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pem`
--

INSERT INTO `t_pem` (`id`, `kd_pemasukan`, `kd_pabrik`, `nama_pbrk`, `tanggal`, `total`) VALUES
(1, 'PEM', 'V001', 'Aslimindo', '2020-06-27', 73),
(2, 'PEM2', 'V002', 'Selindo', '2020-07-16', 30),
(3, 'PEM3', 'V002', 'Selindo', '2020-08-15', 2),
(4, 'PEM4', 'V001', 'Aslimindo', '2020-08-16', 5),
(5, 'PEM5', 'V003', 'M2M', '2020-08-17', 50);

-- --------------------------------------------------------

--
-- Table structure for table `t_peng`
--

CREATE TABLE `t_peng` (
  `id` int(25) NOT NULL,
  `kd_pengeluaran` varchar(25) NOT NULL,
  `kd_pelanggan` varchar(25) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `nama_plngn` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_peng`
--

INSERT INTO `t_peng` (`id`, `kd_pengeluaran`, `kd_pelanggan`, `kategori`, `nama_plngn`, `tanggal`, `total`) VALUES
(1, 'PNG1', 'C001', 'Daerah', 'Cabang Jakarta', '2020-06-27', 5),
(2, 'PNG2', 'C002', 'Daerah', 'Cabang Bogor', '2020-08-15', 3),
(6, 'PNG3', 'C003', 'Daerah', 'Cabang Medan', '2020-08-16', 10),
(7, 'PNG7', 'C002', 'Daerah', 'Cabang Bogor', '2020-08-17', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_detailpemtemp`
--
ALTER TABLE `t_detailpemtemp`
  ADD PRIMARY KEY (`kd_detpemtemp`);

--
-- Indexes for table `t_detailpengtemp`
--
ALTER TABLE `t_detailpengtemp`
  ADD PRIMARY KEY (`kd_detpengtemp`);

--
-- Indexes for table `t_pem`
--
ALTER TABLE `t_pem`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `t_peng`
--
ALTER TABLE `t_peng`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_detailpemtemp`
--
ALTER TABLE `t_detailpemtemp`
  MODIFY `kd_detpemtemp` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `t_detailpengtemp`
--
ALTER TABLE `t_detailpengtemp`
  MODIFY `kd_detpengtemp` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `t_pem`
--
ALTER TABLE `t_pem`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `t_peng`
--
ALTER TABLE `t_peng`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
