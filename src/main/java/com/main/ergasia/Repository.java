package com.main.ergasia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Repository {
	private Connection con;

	public Repository() {
		String url = "jdbc:mysql://localhost:3306/dvdDB";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "icsd16191", "1234");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<DVD> getDVDs() {
		String query = "SELECT * FROM DVD WHERE 1";
		ArrayList<DVD> dvds = new ArrayList<DVD>();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (st.execute(query)) {
				rs = st.getResultSet();
				while (rs.next()) {
					dvds.add(new DVD(rs.getInt("id"), rs.getString("titlos"), rs.getString("skhno8eths"),
							rs.getString("hmeromhniaParagwghs"), rs.getString("diarkeia"), rs.getString("eidos"),
							rs.getInt("temaxia"), rs.getString("kostos")));
				}
			}
			return dvds;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public ArrayList searchIn(String pinakas) {
		String query = "SELECT * FROM ? WHERE 1";
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, pinakas);
			ResultSet rs = st.executeQuery();

			switch (pinakas) {
			case "DVD":
				ArrayList<DVD> dvds = new ArrayList<DVD>();
				while (rs.next()) {
					dvds.add(new DVD(rs.getInt("id"), rs.getString("titlos"), rs.getString("skhno8eths"),
							rs.getString("hmeromhniaParagwghs"), rs.getString("diarkeia"), rs.getString("eidos"),
							rs.getInt("temaxia"), rs.getString("kostos")));
				}

				return dvds;
			case "H8opoios":
				ArrayList<H8opoios> hs = new ArrayList<H8opoios>();
				while (rs.next()) {
					hs.add(new H8opoios(rs.getString("Name")));
				}
				return hs;
			case "HasDvd":
				ArrayList<HasDVD> hsd = new ArrayList<HasDVD>();
				while (rs.next()) {
					hsd.add(new HasDVD(rs.getInt("idPurchase"), rs.getInt("DVDid"), rs.getInt("posothta"),
							rs.getString("DVDtitlos")));
				}
				return hsd;

			case "HasH8opoious":
				ArrayList<HasH8opoious> hsh = new ArrayList<HasH8opoious>();
				while (rs.next()) {
					hsh.add(new HasH8opoious(rs.getString("h8opoiosN"), rs.getString("DVDtitlos"), rs.getInt("DVDid")));
				}
				return hsh;

			case "HasLanguage":
				ArrayList<HasLanguage> hsl = new ArrayList<HasLanguage>();
				while (rs.next()) {
					hsl.add(new HasLanguage(rs.getString("languageName"), rs.getString("DVDtitlos"),
							rs.getInt("DVDid")));
				}
				return hsl;
			case "Language":
				ArrayList<Language> l = new ArrayList<Language>();
				while (rs.next()) {
					l.add(new Language(rs.getString("Name")));
				}
				return l;

			case "Order":
				ArrayList<Order> orders = new ArrayList<Order>();
				while (rs.next()) {
					orders.add(new Order(rs.getInt("id"), rs.getInt("purchaseId"),rs.getString("dieu8hnshParadoshs"),
							 rs.getString("hmDhmiourgias"),rs.getString("hmOloklhrwshs"),rs.getString("onomaUser"), 
							 rs.getInt("katastash")));
				}
				return orders;

			case "Pelatis":
			
				ArrayList<Pelatis> pelates = new ArrayList<Pelatis>();
				while (rs.next()) {
					//(String username,String password,String ari8mosKartas, String eidosKartas, String hmeromhniaLhjhs, String kwdikosAsfaleiasKartas,String onomaUser)
					pelates.add(new Pelatis(rs.getString("onoma"),rs.getString("ari8mosKartas"),rs.getString("eidosKartas"),rs.getString("hmLh3hs"),rs.getString("kwdikosAsfaleiasKartas")));
				}
				return pelates;
			case "PurchaseCard":
				ArrayList<PurchaseCard> cards = new ArrayList<PurchaseCard>();
				while (rs.next()) {
					//onomaUser 	id 	katastash 	hmDhmiourgias 
					cards.add(new PurchaseCard(rs.getInt("id"),rs.getString("hmDhmiourgias"),rs.getInt("katastash"),rs.getString("onomaUser")));
				}
				return cards;
			case "User":
				ArrayList<User> users = new ArrayList<User>();
				while (rs.next()) {
					//onomaUser 	id 	katastash 	hmDhmiourgias 
					users.add(new User(rs.getString("onoma"),rs.getString("kwdikos"),rs.getString("rolos")));
				}
				return users;
			case "Ypallhlos":
				ArrayList<Ypallhlos> yp = new ArrayList<Ypallhlos>();
				while (rs.next()) {
					//onomaUser 	id 	katastash 	hmDhmiourgias 
					yp.add(new Ypallhlos(rs.getString("onoma"),rs.getString("typos")));
				}
				return yp;
			
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public void addDvd(DVD dvd) {

		String query = "INSERT INTO `DVD`( `titlos`, `skhno8eths`, `hmeromhniaParagwghs`, `diarkeia`, `eidos`, `temaxia`, `kostos`) VALUES (?,?,?,?,?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, dvd.getTitlos());
			st.setString(2, dvd.getSkhno8eths());
			st.setString(3, dvd.getHmeromhniaParagwghs());
			st.setString(4, dvd.getDiarkeia());
			st.setString(5, dvd.getEidos());
			st.setInt(6, dvd.getTemaxia());
			st.setString(7, dvd.getKostos());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addH8opoios(H8opoios h8opoios) {

		String query = "INSERT INTO `H8opoios`(`Name`) VALUES (?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, h8opoios.getName());
			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addHasDVD(HasDVD hasDvd) {// for Purchase Card

		String query = "INSERT INTO `HasDVD`(`idPurchase`, `DVDtitlos`, `DVDid`) VALUES (?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setInt(1, hasDvd.getIdPurchase());
			st.setString(2, hasDvd.getDVDtitlos());
			st.setInt(3, hasDvd.getDVDid());
			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addHasH8opoious(HasH8opoious hasH8opoious) {// for Purchase Card

		String query = "INSERT INTO `HasH8opoious`(`h8opoiosN`, `DVDtitlos`, `DVDid`) VALUES (?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, hasH8opoious.getH8opoiosName());
			st.setString(2, hasH8opoious.getDVDtitlos());
			st.setInt(3, hasH8opoious.getDVDid());
			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addHasLanguage(HasLanguage hasLanguage) {// for Purchase Card

		String query = "INSERT INTO `HasLanguage`(`languageName`, `DVDtitlos`, `DVDid`) VALUES (?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, hasLanguage.getLanguageName());
			st.setString(2, hasLanguage.getDVDtitlos());
			st.setInt(3, hasLanguage.getDVDid());
			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addLanguage(Language Language) {// for Purchase Card

		String query = "INSERT INTO `Language`(`Name`) VALUES (?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, Language.getName());
			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addOrder(Order order) {
		String query = "INSERT INTO `Oder`(`onomaUser`" + ", `purchaseId`, `dieu8hnshParadoshs`, `katastash`"
				+ ", `hmDhmiourgias`, `hmOloklhrwshs`) VALUES (?,?,?,?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, order.getOnomaUser());
			st.setInt(2, order.getPurchaseId());
			st.setString(3, order.getDieu8Paradoshs());
			st.setInt(4, order.getKatastash());
			st.setString(5, order.getHmDhmiourgias());
			st.setString(6, order.getHmOloklhrwshs());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addPelatis(Pelatis pelatis) {
		String query = "INSERT INTO `Pelaths`"
				+ "(`onoma`, `ari8mosKartas`, `eidosKartas`, `hmLh3hs`, `kwdikosAsfaleiasKartas`)"
				+ " VALUES (?,?,?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, pelatis.getOnomaUser());
			st.setString(2, pelatis.getAri8mosKartas());
			st.setString(3, pelatis.getEidosKartas());
			st.setString(4, pelatis.getHmeromhniaLhjhs());
			st.setString(5, pelatis.getKwdikosAsfaleiasKartas());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addPurchaseCard(PurchaseCard purchaseCard) {
		String query = "INSERT INTO `PurchaseCard`(`onomaUser`,`katastash`, `hmDhmiourgias`) VALUES (?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, purchaseCard.getOnomaUser());
			;
			st.setInt(2, purchaseCard.getKatastash());
			st.setString(3, purchaseCard.getHmDhmiourgias());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addUser(User user) {
		String query = "INSERT INTO `User`(`onoma`, `kwdikos`, `rolos`) VALUES (?,?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, user.getOnoma());
			;
			st.setString(2, user.getKwdikos());
			st.setString(3, user.getRolos());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addYpallhlos(Ypallhlos yp) {
		String query = "INSERT INTO `Ypallhlos`(`onoma`, `typos`) VALUES (?,?)";

		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1, yp.getOnoma());
			;
			st.setString(2, yp.getTypos());

			int rows = st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
