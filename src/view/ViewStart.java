package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import controller.Controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modell.Kund;
import modell.Order;
import modell.Orderrad;
import modell.Produkt;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class ViewStart extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 3073610616313664339L;
	private Order order = new Order();
	private JPanel contentPane;
	private JLabel lblVadVillDu;
	private JTabbedPane tabbedPane;
	private JPanel kundreg;
	private JPanel produktregister;
	private JPanel Regkund;
	private JTextField txtForetagsnamn;
	private JTextField txtKontaktperson;
	private JTextField txtMail;
	private JLabel foretagsnamn;
	private JLabel kontaktperson;
	private JLabel mail;
	private JTextField txtTelenr;
	private JLabel telenr;
	private JLabel orgnr;
	private JTextField txtOrgnr;
	private JButton rega;
	private JCheckBox checkbox;
	private JLabel godkann;
	private JButton avtalet;
	private Controller controller = new Controller();
	private JTextField leta;
	private JLabel lblNewLabel;
	private final JButton btnHittaKund = new JButton("Sök Kund");
	private JTabbedPane tabbedPane_1;
	private JPanel Orderreg;
	private JPanel foretagsinfo;
	private JTextField textForetagsnamn;
	private JTextField textKontaktperson;
	private JTextField textMail;
	private JTextField textFakPostOrt;
	private JTextField textFaktura;
	private JLabel fakturaadress;
	private JTextField txtFaktura;
	private JTextField txtFakPostOrt;
	private JLabel lblFaktura;
	private JTextField textTelenr;
	private JCheckBox checkboxK;
	private JLabel lblKreditvrdig;
	private JLabel lbnNamn;
	private JTextField textNamn;
	private JTextField textPris;
	private JLabel lblProduktKod;
	private JLabel label;
	private JLabel lblPris;
	private JTextField textKod;
	private JButton btnSkapaProdukt;
	private JLabel lblVikt;
	private JLabel lblInfo;
	private JTextField textViktAntal;
	private JTextField textProduktGrupp;
	private JTextField textInfo;
	private JLabel lblGrupp;
	private JTabbedPane tabbedPane_2;
	private JPanel panel;
	private JTextField letaprodukt;
	private JLabel lablProduknamn;
	private JTextField txtProduktnamn;
	private JTextField txtProduktkod;
	private JLabel lablProduktkod;
	private JLabel lablLagerstatus;
	private JTextField txtLagerstatus;
	private JLabel lablViktAntal;
	private JTextField txtViktAntal;
	private JLabel lablOvrigInfo;
	private JTextField txtInfo;
	private JLabel lblLagerstatus;
	private JTextField textLagerstatus;
	private JButton btnUppdateraProdukt;
	private JLabel lablPris;
	private JTextField txtPris;
	private JLabel lblOrgnr;
	private JTextField textOrgnr;
	private JLabel lblProduktgrupp;
	private JTextField txtGrupp;
	private JTextField textProduktKod;
	private JLabel lblProduktkod_1;
	private JLabel lblAntal;
	private JSpinner antalVara;
	private JSpinner antalVaraOrder;
	private JTable ordertabell;
	private JScrollPane scrollPane;
	private JTextField textforetagsnamn;
	private JTextField textLeveransadress;
	private JTextField textLevPost;
	private JTextField texttotalpris;
	private JLabel lblTotalpris;

	DefaultTableModel tablemodel;
	private JTextField textOrderIdCounter;
	private JLabel lblOrdernummer;
	private JTextField textletaOrder;
	private JTable OrderregisterTabell;
	private JTextField textTotalPris;
	private JTextField textForetagsnamnOrder;
	private JLabel lblForetagsNamn;
	private JTextField textLeveransOrder;
	private JTextField textLevPostOrtOrder;
	private JLabel lblLeveransAdress;
	private JButton btnUppdateraLeverans;
	private JTextField textProduktKodOrder;
	private JButton btnAddOrderradOrder;
	private JButton btnTaBort_1;
	private JTable produkttabellen;

	private DefaultTableModel produkttabell;
	private JScrollPane scrollProduktlistapane;
	private JTable tblOrdershistorik;
	private DefaultTableModel dtmOrderhistorik;
	private JScrollPane scrollPane_Orderhistorik;
	private JTextField textBestallare;
	private JTextField txtBestallare;
	private JLabel lablBestallare;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStart frame = new ViewStart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblVadVillDu = new JLabel("Schinn & Behn");
		lblVadVillDu.setBounds(264, 5, 89, 16);
		contentPane.add(lblVadVillDu);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 26, 618, 494);
		contentPane.add(tabbedPane);

		Regkund = new JPanel();
		tabbedPane.addTab("Registera Kund", null, Regkund, null);
		Regkund.setLayout(null);

		orgnr = new JLabel("Organisationsnummer");
		orgnr.setBounds(107, 41, 148, 16);
		Regkund.add(orgnr);

		txtOrgnr = new JTextField();
		txtOrgnr.setBounds(299, 35, 196, 28);
		Regkund.add(txtOrgnr);
		txtOrgnr.setColumns(10);

		foretagsnamn = new JLabel("Företagsnamn");
		foretagsnamn.setBounds(107, 74, 148, 16);
		Regkund.add(foretagsnamn);

		txtForetagsnamn = new JTextField();
		txtForetagsnamn.setBounds(299, 68, 196, 28);
		Regkund.add(txtForetagsnamn);
		txtForetagsnamn.setColumns(10);

		fakturaadress = new JLabel("Fakturaadress");
		fakturaadress.setBounds(107, 107, 148, 16);
		Regkund.add(fakturaadress);

		txtFaktura = new JTextField();
		txtFaktura.setBounds(299, 101, 196, 28);
		Regkund.add(txtFaktura);
		txtFaktura.setColumns(10);

		txtFakPostOrt = new JTextField();
		txtFakPostOrt.setBounds(299, 134, 196, 28);
		Regkund.add(txtFakPostOrt);
		txtFakPostOrt.setColumns(10);

		kontaktperson = new JLabel("Kontaktperson");
		kontaktperson.setBounds(107, 173, 92, 16);
		Regkund.add(kontaktperson);

		txtKontaktperson = new JTextField();
		txtKontaktperson.setBounds(299, 167, 196, 28);
		txtKontaktperson.setColumns(10);
		Regkund.add(txtKontaktperson);

		mail = new JLabel("Mail-adress");
		mail.setBounds(107, 206, 148, 16);
		Regkund.add(mail);

		txtMail = new JTextField();
		txtMail.setBounds(299, 200, 196, 28);
		txtMail.setColumns(10);
		Regkund.add(txtMail);

		telenr = new JLabel("Telefonnummer");
		telenr.setBounds(107, 239, 148, 16);
		Regkund.add(telenr);

		txtTelenr = new JTextField();
		txtTelenr.setBounds(299, 233, 196, 28);
		Regkund.add(txtTelenr);
		txtTelenr.setColumns(10);

		godkann = new JLabel("Godkänner kreditavtal");
		godkann.setBounds(107, 299, 148, 16);
		Regkund.add(godkann);

		checkbox = new JCheckBox("");
		checkbox.setBounds(263, 296, 28, 23);
		Regkund.add(checkbox);

		lblKreditvrdig = new JLabel("Kreditvärdig");
		lblKreditvrdig.setBounds(107, 327, 148, 16);
		Regkund.add(lblKreditvrdig);

		checkboxK = new JCheckBox("");
		checkboxK.setBounds(263, 324, 28, 23);
		Regkund.add(checkboxK);

		avtalet = new JButton("Läs kreditavtalet");
		avtalet.setBounds(107, 352, 148, 29);
		avtalet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.visaavtal();
			}
		});
		Regkund.add(avtalet);

		rega = new JButton("Registera");
		rega.setBounds(299, 352, 196, 29);
		rega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registeranykund();
			}
		});
		Regkund.add(rega);

		kundreg = new JPanel();
		kundreg.setToolTipText("");
		tabbedPane.addTab("Kundregister", null, kundreg, null);
		kundreg.setLayout(null);

		lblNewLabel = new JLabel("Organisationnummer:");
		lblNewLabel.setBounds(86, 11, 145, 16);
		kundreg.add(lblNewLabel);

		leta = new JTextField();
		leta.setBounds(231, 5, 134, 28);
		kundreg.add(leta);
		leta.setColumns(10);
		btnHittaKund.setBounds(246, 41, 120, 29);
		btnHittaKund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				killOrderhistorik();
				textforetagsnamn.setText(null);
				textLeveransadress.setText(null);
				textLevPost.setText(null);
				letaKund();
				leta.setText(null);
				uppdateraOrderhistorik();
				textOrderIdCounter.setText(null);

			}

		});

		kundreg.add(btnHittaKund);

		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 67, 597, 381);
		kundreg.add(tabbedPane_1);

		foretagsinfo = new JPanel();
		tabbedPane_1.addTab("Företagsinformation", null, foretagsinfo, null);
		GridBagLayout gbl_foretagsinfo = new GridBagLayout();
		gbl_foretagsinfo.columnWidths = new int[] { 74, 140, 51, 210, 41, 60, 0 };
		gbl_foretagsinfo.rowHeights = new int[] { 38, 16, 28, 28, 28, 28, 28,
				28, 29, 0 };
		gbl_foretagsinfo.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_foretagsinfo.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		foretagsinfo.setLayout(gbl_foretagsinfo);

		lblOrgnr = new JLabel("Organisationsnummer:");
		GridBagConstraints gbc_lblOrgnr = new GridBagConstraints();
		gbc_lblOrgnr.anchor = GridBagConstraints.WEST;
		gbc_lblOrgnr.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrgnr.gridx = 1;
		gbc_lblOrgnr.gridy = 1;
		foretagsinfo.add(lblOrgnr, gbc_lblOrgnr);

		textOrgnr = new JTextField();
		textOrgnr.setEditable(false);
		textOrgnr.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		foretagsinfo.add(textOrgnr, gbc_textField_1);

		JLabel lblforetagsnamn = new JLabel("Företagsnamn: ");
		GridBagConstraints gbc_lblforetagsnamn = new GridBagConstraints();
		gbc_lblforetagsnamn.anchor = GridBagConstraints.WEST;
		gbc_lblforetagsnamn.insets = new Insets(0, 0, 5, 5);
		gbc_lblforetagsnamn.gridx = 1;
		gbc_lblforetagsnamn.gridy = 2;
		foretagsinfo.add(lblforetagsnamn, gbc_lblforetagsnamn);

		textForetagsnamn = new JTextField();
		GridBagConstraints gbc_textForetagsnamn = new GridBagConstraints();
		gbc_textForetagsnamn.anchor = GridBagConstraints.NORTH;
		gbc_textForetagsnamn.fill = GridBagConstraints.HORIZONTAL;
		gbc_textForetagsnamn.insets = new Insets(0, 0, 5, 5);
		gbc_textForetagsnamn.gridx = 3;
		gbc_textForetagsnamn.gridy = 2;
		foretagsinfo.add(textForetagsnamn, gbc_textForetagsnamn);
		textForetagsnamn.setColumns(10);

		lblFaktura = new JLabel("Fakturaadress: ");
		GridBagConstraints gbc_lblFaktura = new GridBagConstraints();
		gbc_lblFaktura.anchor = GridBagConstraints.WEST;
		gbc_lblFaktura.insets = new Insets(0, 0, 5, 5);
		gbc_lblFaktura.gridx = 1;
		gbc_lblFaktura.gridy = 3;
		foretagsinfo.add(lblFaktura, gbc_lblFaktura);

		textFaktura = new JTextField();
		textFaktura.setColumns(10);
		GridBagConstraints gbc_textFaktura = new GridBagConstraints();
		gbc_textFaktura.anchor = GridBagConstraints.NORTH;
		gbc_textFaktura.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFaktura.insets = new Insets(0, 0, 5, 5);
		gbc_textFaktura.gridx = 3;
		gbc_textFaktura.gridy = 3;
		foretagsinfo.add(textFaktura, gbc_textFaktura);

		textFakPostOrt = new JTextField();
		textFakPostOrt.setColumns(10);
		GridBagConstraints gbc_textFakPostOrt = new GridBagConstraints();
		gbc_textFakPostOrt.anchor = GridBagConstraints.NORTH;
		gbc_textFakPostOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFakPostOrt.insets = new Insets(0, 0, 5, 5);
		gbc_textFakPostOrt.gridx = 3;
		gbc_textFakPostOrt.gridy = 4;
		foretagsinfo.add(textFakPostOrt, gbc_textFakPostOrt);

		JLabel lblKontaktperson = new JLabel("Kontaktperson: ");
		GridBagConstraints gbc_lblKontaktperson = new GridBagConstraints();
		gbc_lblKontaktperson.anchor = GridBagConstraints.WEST;
		gbc_lblKontaktperson.insets = new Insets(0, 0, 5, 5);
		gbc_lblKontaktperson.gridx = 1;
		gbc_lblKontaktperson.gridy = 5;
		foretagsinfo.add(lblKontaktperson, gbc_lblKontaktperson);

		JButton btnUppdatera = new JButton("Uppdatera");
		btnUppdatera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.uppdateraKund(textOrgnr.getText(),
						textForetagsnamn.getText(), textFaktura.getText(),
						textFakPostOrt.getText(), textKontaktperson.getText(),
						textMail.getText(), textTelenr.getText());

				textforetagsnamn.setText(textForetagsnamn.getText());
				textLeveransadress.setText(textFaktura.getText());
				textLevPost.setText(textFakPostOrt.getText());

			}
		});

		textKontaktperson = new JTextField();
		textKontaktperson.setColumns(10);
		GridBagConstraints gbc_textKontaktperson = new GridBagConstraints();
		gbc_textKontaktperson.anchor = GridBagConstraints.NORTH;
		gbc_textKontaktperson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textKontaktperson.insets = new Insets(0, 0, 5, 5);
		gbc_textKontaktperson.gridx = 3;
		gbc_textKontaktperson.gridy = 5;
		foretagsinfo.add(textKontaktperson, gbc_textKontaktperson);

		JLabel lblMail = new JLabel("Mail: ");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 1;
		gbc_lblMail.gridy = 6;
		foretagsinfo.add(lblMail, gbc_lblMail);

		textMail = new JTextField();
		textMail.setColumns(10);
		GridBagConstraints gbc_textMail = new GridBagConstraints();
		gbc_textMail.anchor = GridBagConstraints.NORTH;
		gbc_textMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMail.insets = new Insets(0, 0, 5, 5);
		gbc_textMail.gridx = 3;
		gbc_textMail.gridy = 6;
		foretagsinfo.add(textMail, gbc_textMail);

		JLabel lblTelefonnummer = new JLabel("Telefonnummer: ");
		GridBagConstraints gbc_lblTelefonnummer = new GridBagConstraints();
		gbc_lblTelefonnummer.anchor = GridBagConstraints.WEST;
		gbc_lblTelefonnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefonnummer.gridx = 1;
		gbc_lblTelefonnummer.gridy = 7;
		foretagsinfo.add(lblTelefonnummer, gbc_lblTelefonnummer);

		textTelenr = new JTextField();
		GridBagConstraints gbc_textTelenr = new GridBagConstraints();
		gbc_textTelenr.anchor = GridBagConstraints.NORTH;
		gbc_textTelenr.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelenr.insets = new Insets(0, 0, 5, 5);
		gbc_textTelenr.gridx = 3;
		gbc_textTelenr.gridy = 7;
		foretagsinfo.add(textTelenr, gbc_textTelenr);
		textTelenr.setColumns(10);
		GridBagConstraints gbc_btnUppdatera = new GridBagConstraints();
		gbc_btnUppdatera.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnUppdatera.insets = new Insets(0, 0, 0, 5);
		gbc_btnUppdatera.gridx = 3;
		gbc_btnUppdatera.gridy = 8;
		foretagsinfo.add(btnUppdatera, gbc_btnUppdatera);

		JPanel skapaOrder = new JPanel();
		tabbedPane_1.addTab("Skapa Order", null, skapaOrder, null);
		skapaOrder.setLayout(null);

		lblProduktkod_1 = new JLabel("Produktkod");
		lblProduktkod_1.setBounds(55, 6, 73, 16);
		skapaOrder.add(lblProduktkod_1);

		lblAntal = new JLabel("Antal");
		lblAntal.setBounds(173, 6, 37, 16);
		skapaOrder.add(lblAntal);

		textProduktKod = new JTextField();
		textProduktKod.setBounds(45, 24, 98, 28);
		skapaOrder.add(textProduktKod);
		textProduktKod.setColumns(10);

		SpinnerModel sm = new SpinnerNumberModel(1, 1, 9, 1);

		//

		antalVara = new JSpinner(sm);
		antalVara.setBounds(161, 24, 61, 28);

		skapaOrder.add(antalVara);

		tablemodel = new DefaultTableModel();
		String col[] = { "Namn", "Antal", "Pris/st", "Pris" };
		tablemodel.setColumnIdentifiers(col);

		JButton btnAddOrderrad = new JButton("Lägg till");
		btnAddOrderrad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOrderIdCounter.setText(null);
				Produkt p = controller.hittaProdukt(textProduktKod.getText());
				if (p == null) {

					JOptionPane.showMessageDialog(null,
							"Det finns inga produkter med den produktkoden");
				} else {
					addOrderrad();

				}
			}
		});
		btnAddOrderrad.setBounds(250, 25, 115, 29);
		skapaOrder.add(btnAddOrderrad);

		ordertabell = new JTable(tablemodel);
		ordertabell.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(ordertabell);
		scrollPane.setBounds(45, 58, 443, 132);
		skapaOrder.add(scrollPane);

		scrollPane.setViewportView(ordertabell);
		ordertabell.removeEditor();

		JLabel lblLeveransadress = new JLabel("Leveransadress: ");
		lblLeveransadress.setBounds(45, 229, 104, 16);
		skapaOrder.add(lblLeveransadress);

		textforetagsnamn = new JTextField();
		textforetagsnamn.setEditable(false);
		textforetagsnamn.setBounds(149, 196, 155, 28);
		skapaOrder.add(textforetagsnamn);
		textforetagsnamn.setColumns(10);
		textforetagsnamn.setText(textForetagsnamn.getText());

		JLabel lblFretagsnamn = new JLabel("Företagsnamn");
		lblFretagsnamn.setBounds(45, 201, 98, 16);
		skapaOrder.add(lblFretagsnamn);

		textLeveransadress = new JTextField();
		textLeveransadress.setBounds(149, 223, 155, 28);
		skapaOrder.add(textLeveransadress);
		textLeveransadress.setColumns(10);
		textLeveransadress.setText(txtFaktura.getText());

		textLevPost = new JTextField();
		textLevPost.setBounds(149, 254, 155, 28);
		skapaOrder.add(textLevPost);
		textLevPost.setColumns(10);
		textLevPost.setText(txtFakPostOrt.getText());

		texttotalpris = new JTextField();
		texttotalpris.setEditable(false);
		texttotalpris.setBounds(422, 196, 66, 28);
		skapaOrder.add(texttotalpris);
		texttotalpris.setColumns(10);

		lblTotalpris = new JLabel("Totalpris:");
		lblTotalpris.setBounds(361, 202, 61, 16);
		skapaOrder.add(lblTotalpris);

		JButton btnNewButton = new JButton("Slutför Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Kund k = controller.hittaKund(textOrgnr.getText());
				if (k != null) {
					if (!texttotalpris.getText().equals("")) {
						if (!textBestallare.getText().equals("")) {
							order.setKund(k);
							order.setBestallare(textBestallare.getText());
							order.setPris(order.totalprisorder());
							controller.addOrder(order);
							textOrderIdCounter.setText(order.getOrdernr());
							k.addOrder(order);
							JOptionPane.showMessageDialog(null,
									"Ordern har slutförts! \n Ordernummer:"
											+ textOrderIdCounter.getText());
							order = new Order();
							uppdateraOrderhistorik();
							killOrderLista();

						} else {
							JOptionPane.showMessageDialog(null,
									"Ingen beställare är inskriven");
						}
					}

					else {
						JOptionPane.showMessageDialog(null,
								"Inga valda produkter");
					}
				}

				else {
					JOptionPane.showMessageDialog(null, "Ingen kund vald");
				}
			}
		});
		btnNewButton.setBounds(453, 300, 117, 29);
		skapaOrder.add(btnNewButton);

		textOrderIdCounter = new JTextField();
		textOrderIdCounter.setEditable(false);
		textOrderIdCounter.setBounds(149, 284, 155, 28);
		skapaOrder.add(textOrderIdCounter);
		textOrderIdCounter.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ordernummer:");
		lblNewLabel_1.setBounds(45, 290, 98, 16);
		skapaOrder.add(lblNewLabel_1);

		JButton btnTaBort = new JButton("Ta bort");
		btnTaBort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taBortOrderrad();
			}
		});
		btnTaBort.setBounds(370, 25, 115, 29);
		skapaOrder.add(btnTaBort);

		JLabel lblBestallare = new JLabel("Beställare:");
		lblBestallare.setBounds(358, 229, 73, 16);
		skapaOrder.add(lblBestallare);

		textBestallare = new JTextField();
		textBestallare.setColumns(10);
		textBestallare.setBounds(422, 223, 117, 28);
		skapaOrder.add(textBestallare);

		JPanel Orderhistorik = new JPanel();
		tabbedPane_1.addTab("Orderhistorik", null, Orderhistorik, null);
		Orderhistorik.setLayout(null);

		dtmOrderhistorik = new DefaultTableModel();

		String columOr[] = { "Ordernummer", "Datum", "Antal Produkter", "Pris",
				"Leveransdatum" };
		dtmOrderhistorik.setColumnIdentifiers(columOr);

		tblOrdershistorik = new JTable(dtmOrderhistorik);

		scrollPane_Orderhistorik = new JScrollPane(tblOrdershistorik);
		scrollPane_Orderhistorik.setBounds(6, 6, 564, 270);

		Orderhistorik.add(scrollPane_Orderhistorik);

		scrollPane_Orderhistorik.setViewportView(tblOrdershistorik);

		JButton btnppnaOrder = new JButton("Öppna Order");
		btnppnaOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valdrad = tblOrdershistorik.getSelectedRow();
				int kundnr = 0;
				if (valdrad != -1) {
					kundnr = Integer.parseInt((String) tblOrdershistorik
							.getModel().getValueAt(valdrad, 0));
					kundnr = 0;
					// controller.hittaOrder(0);
				}
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnppnaOrder.setBounds(453, 288, 117, 29);
		Orderhistorik.add(btnppnaOrder);

		JPanel regProdukt = new JPanel();
		tabbedPane.addTab("Registera Produkt", null, regProdukt, null);
		regProdukt.setLayout(null);

		label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		regProdukt.add(label);

		lbnNamn = new JLabel("Namn:");
		lbnNamn.setBounds(96, 36, 41, 16);
		regProdukt.add(lbnNamn);

		textNamn = new JTextField();
		textNamn.setBounds(241, 30, 210, 28);
		regProdukt.add(textNamn);
		textNamn.setColumns(10);

		lblProduktKod = new JLabel("Produktkod:");
		lblProduktKod.setBounds(96, 69, 77, 16);
		regProdukt.add(lblProduktKod);

		textKod = new JTextField();
		textKod.setBounds(241, 63, 210, 28);
		textKod.setColumns(10);
		regProdukt.add(textKod);

		lblPris = new JLabel("Pris:");
		lblPris.setBounds(96, 102, 27, 16);
		regProdukt.add(lblPris);

		textPris = new JTextField();
		textPris.setBounds(241, 96, 210, 28);
		regProdukt.add(textPris);
		textPris.setColumns(10);

		lblVikt = new JLabel("Vikt / Antal:");
		lblVikt.setBounds(96, 135, 90, 16);
		regProdukt.add(lblVikt);

		textViktAntal = new JTextField();
		textViktAntal.setBounds(241, 129, 210, 28);
		textViktAntal.setColumns(10);
		regProdukt.add(textViktAntal);

		lblGrupp = new JLabel("Produktgrupp:");
		lblGrupp.setBounds(96, 168, 90, 16);
		regProdukt.add(lblGrupp);

		textProduktGrupp = new JTextField();
		textProduktGrupp.setBounds(241, 162, 210, 28);
		textProduktGrupp.setColumns(10);
		regProdukt.add(textProduktGrupp);

		lblLagerstatus = new JLabel("Lagerstatus:");
		lblLagerstatus.setBounds(96, 201, 77, 16);
		regProdukt.add(lblLagerstatus);

		textLagerstatus = new JTextField();
		textLagerstatus.setBounds(241, 195, 210, 28);
		regProdukt.add(textLagerstatus);
		textLagerstatus.setColumns(10);

		lblInfo = new JLabel("Övrig info:");
		lblInfo.setBounds(96, 228, 90, 16);
		regProdukt.add(lblInfo);

		btnSkapaProdukt = new JButton("Skapa Produkt");
		btnSkapaProdukt.setBounds(280, 268, 134, 29);
		btnSkapaProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registeranyprodukt();
				uppdateraProduktLista();
			}

		});

		textInfo = new JTextField();
		textInfo.setBounds(241, 228, 210, 28);
		textInfo.setColumns(10);
		regProdukt.add(textInfo);
		regProdukt.add(btnSkapaProdukt);

		produktregister = new JPanel();
		tabbedPane.addTab("Produktregister", null, produktregister, null);
		produktregister.setLayout(null);

		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 67, 597, 381);
		produktregister.add(tabbedPane_2);

		panel = new JPanel();
		tabbedPane_2.addTab("Produktinformation", null, panel, null);
		panel.setLayout(null);

		lablProduknamn = new JLabel("Namn:");
		lablProduknamn.setBounds(140, 57, 41, 13);
		panel.add(lablProduknamn);

		txtProduktnamn = new JTextField();
		txtProduktnamn.setBounds(235, 49, 210, 28);
		panel.add(txtProduktnamn);
		txtProduktnamn.setColumns(10);

		lablProduktkod = new JLabel("Produktkod:");
		lablProduktkod.setBounds(140, 27, 77, 16);
		panel.add(lablProduktkod);

		txtProduktkod = new JTextField();
		txtProduktkod.setEditable(false);
		txtProduktkod.setBounds(235, 21, 210, 28);
		panel.add(txtProduktkod);
		txtProduktkod.setColumns(10);

		lablPris = new JLabel("Pris:");
		lablPris.setBounds(140, 88, 27, 16);
		panel.add(lablPris);

		txtPris = new JTextField();
		txtPris.setBounds(235, 82, 210, 28);
		panel.add(txtPris);
		txtPris.setColumns(10);

		lablViktAntal = new JLabel("Vikt/Antal:");
		lablViktAntal.setBounds(140, 121, 90, 16);
		panel.add(lablViktAntal);

		txtViktAntal = new JTextField();
		txtViktAntal.setBounds(235, 115, 210, 28);
		panel.add(txtViktAntal);
		txtViktAntal.setColumns(10);

		lblProduktgrupp = new JLabel("Produktgrupp:");
		lblProduktgrupp.setBounds(140, 154, 90, 16);
		panel.add(lblProduktgrupp);

		txtGrupp = new JTextField();
		txtGrupp.setBounds(235, 148, 210, 28);
		panel.add(txtGrupp);
		txtGrupp.setColumns(10);

		lablLagerstatus = new JLabel("Lagerstatus:");
		lablLagerstatus.setBounds(140, 187, 77, 16);
		panel.add(lablLagerstatus);

		txtLagerstatus = new JTextField();
		txtLagerstatus.setBounds(235, 181, 210, 28);
		panel.add(txtLagerstatus);
		txtLagerstatus.setColumns(10);

		btnUppdateraProdukt = new JButton("Uppdatera");
		btnUppdateraProdukt.setBounds(235, 292, 108, 29);
		btnUppdateraProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = Integer.parseInt(txtPris.getText()); // gör om string
																// till int
				int b = Integer.parseInt(txtLagerstatus.getText());

				controller.uppdateraProdukt(letaprodukt.getText(),
						txtProduktnamn.getText(), a, txtViktAntal.getText(),
						txtGrupp.getText(), b, txtInfo.getText());

			}
		});

		lablOvrigInfo = new JLabel("Övrig Info:");
		lablOvrigInfo.setBounds(140, 219, 90, 16);
		panel.add(lablOvrigInfo);

		txtInfo = new JTextField();
		txtInfo.setBounds(235, 214, 210, 21);
		panel.add(txtInfo);
		txtInfo.setColumns(10);
		panel.add(btnUppdateraProdukt);

		JPanel produktlista = new JPanel();
		tabbedPane_2.addTab("Produktlista", null, produktlista, null);
		produktlista.setLayout(null);

		produkttabell = new DefaultTableModel();

		String colum[] = { "Namn", "Kod", "Pris/st", "Vikt/Antal",
				"Produktgrupp", "Lagerstatus", "Övrig information" };
		produkttabell.setColumnIdentifiers(colum);

		produkttabellen = new JTable(produkttabell);

		scrollProduktlistapane = new JScrollPane(produkttabellen);
		scrollProduktlistapane.setBounds(6, 6, 564, 232);
		produktlista.add(scrollProduktlistapane);

		scrollProduktlistapane.setViewportView(produkttabellen);

		JButton btnTabortProdukt = new JButton("Ta bort");
		btnTabortProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taBortProdukt();
			}
		});
		btnTabortProdukt.setBounds(453, 250, 117, 29);
		produktlista.add(btnTabortProdukt);

		letaprodukt = new JTextField();
		letaprodukt.setBounds(231, 5, 134, 28);
		produktregister.add(letaprodukt);
		letaprodukt.setColumns(10);

		JLabel lblProduktkod = new JLabel("Produktkod:");
		lblProduktkod.setBounds(155, 11, 90, 16);
		produktregister.add(lblProduktkod);

		JButton btnSökProdukt = new JButton("Sök Produkt");
		btnSökProdukt.setBounds(246, 41, 120, 29);
		btnSökProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letaProdukt();
			}
		});
		produktregister.add(btnSökProdukt);

		Orderreg = new JPanel();
		tabbedPane.addTab("Orderregister", null, Orderreg, null);
		Orderreg.setLayout(null);

		lblOrdernummer = new JLabel("Ordernummer: ");
		lblOrdernummer.setBounds(138, 11, 95, 16);
		Orderreg.add(lblOrdernummer);

		textletaOrder = new JTextField();
		textletaOrder.setBounds(231, 5, 134, 28);
		Orderreg.add(textletaOrder);
		textletaOrder.setColumns(10);

		JButton btnHittaOrder = new JButton("Sök Order");
		btnHittaOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.hittaOrder(textletaOrder.getText());
				letaOrder();

			}
		});
		btnHittaOrder.setBounds(246, 41, 120, 29);
		Orderreg.add(btnHittaOrder);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 67, 597, 381);
		Orderreg.add(tabbedPane_3);

		JPanel panel_1 = new JPanel();
		tabbedPane_3.addTab("Orderinformation", null, panel_1, null);
		panel_1.setLayout(null);

		SpinnerModel smo = new SpinnerNumberModel(1, 1, 9, 1);

		antalVaraOrder = new JSpinner(smo);
		antalVaraOrder.setBounds(161, 24, 61, 28);

		panel_1.add(antalVaraOrder);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(43, 58, 443, 132);
		panel_1.add(scrollPane_1);

		OrderregisterTabell = new JTable();
		scrollPane_1.setViewportView(OrderregisterTabell);

		textLeveransOrder = new JTextField();
		textLeveransOrder.setBounds(147, 227, 173, 28);
		textLeveransOrder.setColumns(10);
		panel_1.add(textLeveransOrder);

		textLevPostOrtOrder = new JTextField();
		textLevPostOrtOrder.setBounds(147, 260, 173, 28);
		textLevPostOrtOrder.setColumns(10);
		panel_1.add(textLevPostOrtOrder);

		textTotalPris = new JTextField();
		textTotalPris.setBounds(424, 196, 66, 28);
		textTotalPris.setEditable(false);
		panel_1.add(textTotalPris);
		textTotalPris.setColumns(10);

		JLabel lblTotaltPris = new JLabel("Totalt pris:");
		lblTotaltPris.setBounds(353, 202, 73, 16);
		panel_1.add(lblTotaltPris);

		textForetagsnamnOrder = new JTextField();
		textForetagsnamnOrder.setBounds(147, 196, 173, 28);
		textForetagsnamnOrder.setEditable(false);
		panel_1.add(textForetagsnamnOrder);
		textForetagsnamnOrder.setColumns(10);

		lblForetagsNamn = new JLabel("Företagsnamn:");
		lblForetagsNamn.setBounds(43, 202, 98, 16);
		panel_1.add(lblForetagsNamn);

		lblLeveransAdress = new JLabel("Leveransadress: ");
		lblLeveransAdress.setBounds(43, 233, 104, 16);
		panel_1.add(lblLeveransAdress);

		btnUppdateraLeverans = new JButton("Uppdatera Order");
		btnUppdateraLeverans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			uppdateraOrderhistorik();
				
			}
		});
		btnUppdateraLeverans.setBounds(353, 300, 135, 29);
		panel_1.add(btnUppdateraLeverans);

		textProduktKodOrder = new JTextField();
		textProduktKodOrder.setColumns(10);
		textProduktKodOrder.setBounds(43, 24, 98, 28);
		panel_1.add(textProduktKodOrder);

		JLabel label_1 = new JLabel("Produktkod");
		label_1.setBounds(53, 6, 73, 16);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("Antal");
		label_2.setBounds(171, 6, 37, 16);
		panel_1.add(label_2);

		btnAddOrderradOrder = new JButton("Lägg till");
		btnAddOrderradOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Produkt p = controller.hittaProdukt(textProduktKodOrder
						.getText());
				if (p == null) {

					JOptionPane.showMessageDialog(null,
							"Det finns inga produkter med den produktkoden");
				} else {
					addOrderradOrder();
				}

			}
		});
		btnAddOrderradOrder.setBounds(250, 25, 120, 29);
		panel_1.add(btnAddOrderradOrder);

		btnTaBort_1 = new JButton("Ta bort");
		btnTaBort_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taBortOrderradOrder();
				uppdateraOrderRegisterTabell();
			}
		});
		btnTaBort_1.setBounds(370, 25, 120, 29);
		panel_1.add(btnTaBort_1);

		txtBestallare = new JTextField();
		txtBestallare.setEditable(false);
		txtBestallare.setColumns(10);
		txtBestallare.setBounds(424, 227, 66, 28);
		panel_1.add(txtBestallare);

		lablBestallare = new JLabel("Beställare:");
		lablBestallare.setBounds(359, 233, 73, 16);
		panel_1.add(lablBestallare);
		uppdateraProduktLista();

	}

	public void uppdateraOrderhistorik() {

		dtmOrderhistorik = new DefaultTableModel();
		String columOr[] = { "Ordernummer", "Datum", "Antal UNIKA Produkter",
				"Pris", "Leveransdatum" };
		dtmOrderhistorik.setColumnIdentifiers(columOr);

		for (Order tmpOrder : controller.getOrdrar()) {
			if (tmpOrder.getKund().getOrgnr().equals(textOrgnr.getText())) {

				String[] row = { tmpOrder.getOrdernr(), "2015-01-15 ",
						String.valueOf(tmpOrder.getOrderrader().size()),
						String.valueOf(tmpOrder.getPris()), "2015-01-21" };
				dtmOrderhistorik.addRow(row);
			}
		}
		tblOrdershistorik.setModel(dtmOrderhistorik);

	}

	private void killOrderLista() {
		tablemodel.setRowCount(0);

	}

	private void killOrderhistorik() {
		dtmOrderhistorik.setRowCount(0);

	}

	public void taBortProdukt() {
		if (produkttabellen.getSelectedRow() >= 0) {
			controller.getProdukter().remove(produkttabellen.getSelectedRow());
			uppdateraProduktLista();
		}
	}

	public void taBortOrderrad() {
		// Om valda orderrader är >=0
		// tar bort index ur tabellen

		if (ordertabell.getSelectedRow() >= 0) {
			order.getOrderrader().remove(ordertabell.getSelectedRow());
			uppdateraOrderlista();
		}
	}

	public void taBortOrderradOrder() {

		for (Order tmp : controller.getOrdrar()) {

			if (tmp.getOrdernr().equals(textletaOrder.getText())) {
				if (OrderregisterTabell.getSelectedRow() >= 0) {
					tmp.getOrderrader().remove(
							OrderregisterTabell.getSelectedRow());

					uppdateraOrderRegisterTabell();
				}
			}
		}
	}

	public int checkNumber(String input) {
		try {
			// försök göra detta
			int a = Integer.parseInt(input);
			return a;
		} catch (NumberFormatException e) {
			// går det åt helvete, gör detta
			JOptionPane.showMessageDialog(null, "Felmeddelande");
			return 0;
		}
	}

	public void uppdateraProduktLista() {

		tablemodel = new DefaultTableModel();
		String col[] = { "Namn", "Kod", "Pris/st", "Vikt/Antal",
				"Produktgrupp", "Lagerstatus", "Övrig information" };
		tablemodel.setColumnIdentifiers(col);

		for (Produkt tmpProdukt : controller.getProdukter()) {
			String[] row = { tmpProdukt.getNamn(), tmpProdukt.getKod(),
					String.valueOf(tmpProdukt.getPris()),
					tmpProdukt.getViktAntal(), tmpProdukt.getGrupp(),
					String.valueOf(tmpProdukt.getLagerstatus()),
					tmpProdukt.getInfo() };
			tablemodel.addRow(row);
		}
		produkttabellen.setModel(tablemodel);

	}

	public void uppdateraOrderlista() {

		tablemodel = new DefaultTableModel();
		String col[] = { "Namn", "Antal", "Pris/st", "Pris" };
		tablemodel.setColumnIdentifiers(col);

		for (Orderrad tmporderrad : order.getOrderrader()) {
			String[] row = { tmporderrad.getProdukt().getNamn(),
					String.valueOf(tmporderrad.getAntal()),
					String.valueOf(tmporderrad.getProdukt().getPris()),
					String.valueOf(tmporderrad.kalktotpris()) };
			tablemodel.addRow(row);
		}
		ordertabell.setModel(tablemodel);
		double totpris = 0;
		for (Orderrad or2 : order.getOrderrader()) {
			totpris += or2.kalktotpris();

			texttotalpris.setText(String.valueOf(totpris));
		}

	}

	public void uppdateraOrderRegisterTabell() {

		tablemodel = new DefaultTableModel();
		String col[] = { "Namn", "Antal", "Pris/st", "Pris" };
		tablemodel.setColumnIdentifiers(col);
		for (Order tmp : controller.getOrdrar()) {
			if (tmp.getOrdernr().equals(textletaOrder.getText())) {

				for (Orderrad tmporderrad : tmp.getOrderrader()) {
					String[] row = { tmporderrad.getProdukt().getNamn(),
							String.valueOf(tmporderrad.getAntal()),
							String.valueOf(tmporderrad.getProdukt().getPris()),
							String.valueOf(tmporderrad.kalktotpris()) };
					tablemodel.addRow(row);
				}

				OrderregisterTabell.setModel(tablemodel);
				double totpris = 0;
				for (Orderrad or2 : tmp.getOrderrader()) {
					totpris += or2.kalktotpris();

					textTotalPris.setText(String.valueOf(totpris));
				}

			}
		}
	}

	public void addOrderrad() {
		Produkt p = controller.hittaProdukt(textProduktKod.getText());
		boolean exists = false;
		if (p != null) {
			for (Orderrad or1 : order.getOrderrader()) {
				if (or1.getProdukt().getKod().equals(p.getKod())) {
					or1.setAntal((or1.getAntal() + (Integer) antalVara
							.getValue()));
					exists = true;
				}
			}

			if (!exists) {
				Orderrad or = new Orderrad();
				or.setProdukt(p);
				or.setAntal((Integer) antalVara.getValue());
				or.setOrder(order);
				order.addOrderrad(or);
			}
			uppdateraOrderlista();
		}

	}

	public void addOrderradOrder() {
		Produkt p = controller.hittaProdukt(textProduktKodOrder.getText());
		boolean exists = false;
		if (p != null) {
			for (Order tmp : controller.getOrdrar()) {
				if (tmp.getOrdernr().equals(textletaOrder.getText())) {
					for (Orderrad or1 : tmp.getOrderrader()) {

						if (or1.getProdukt().getKod().equals(p.getKod())) {
							or1.setAntal((or1.getAntal() + (Integer) antalVaraOrder
									.getValue()));
							exists = true;
						}
					}

					if (!exists) {
						Orderrad or = new Orderrad();
						or.setProdukt(p);
						or.setAntal((Integer) antalVaraOrder.getValue());
						or.setOrder(tmp);
						tmp.addOrderrad(or);
					}
				}
			}
		}
		uppdateraOrderRegisterTabell();
	}

	public void registeranykund() {
		if (controller.hittaKund(txtOrgnr.getText()) == null) {
			if (!txtOrgnr.getText().equals("")) {

				if (checkbox.isSelected() && checkboxK.isSelected()) {

					controller.nyKund(txtOrgnr.getText(),
							txtForetagsnamn.getText(), txtFaktura.getText(),
							txtFakPostOrt.getText(),
							txtKontaktperson.getText(), txtMail.getText(),
							txtTelenr.getText());

					Kund k = controller.hittaKund(txtOrgnr.getText());

					JOptionPane
							.showMessageDialog(
									this,
									"Organisationnummer: "
											+ k.getOrgnr()
											+ "\nFöretagsnamn: "
											+ k.getForetagsnamn()
											+ "\nFakturaadress:  "
											+ k.getFaktura()
											+ "\n "
											+ k.getFakPostOrt()
											+ "\nKontaktperson: "
											+ k.getKontaktperson()
											+ "\nMail: "
											+ k.getMail()
											+ "\nTelefonnummer: "
											+ k.getTelenr()
											+ "\n"
											+ "\n"
											+ k.getForetagsnamn()
											+ " är nu registrerad kund hos AB Schinn & Behn");

				}
				if (!checkbox.isSelected() && !checkboxK.isSelected()) {
					JOptionPane
							.showMessageDialog(this,
									"Du måste godkänna avtalet först och kunden måste vara kreditvärdig");
				} else if (!checkbox.isSelected()) {
					JOptionPane.showMessageDialog(this,
							"Du måste godkänna avtalet först!");
				} else if (!checkboxK.isSelected()) {
					JOptionPane.showMessageDialog(this,
							"Kunden måste vara kreditvärdig!");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Vissa fält är tomma.");
			}
		} else {
			JOptionPane
					.showMessageDialog(this, "Kund finns redan i registeret");
		}
	}

	public void letaKund() {

		boolean b = false;

		for (Kund tmp : controller.getKunder()) {

			if (tmp.getOrgnr().equals(leta.getText())) {
				b = true;
				textOrgnr.setText(tmp.getOrgnr());
				textForetagsnamn.setText(tmp.getForetagsnamn());
				textFaktura.setText(tmp.getFaktura());
				textFakPostOrt.setText(tmp.getFakPostOrt());
				textKontaktperson.setText(tmp.getKontaktperson());
				textMail.setText(tmp.getMail());
				textTelenr.setText(tmp.getTelenr());
				textforetagsnamn.setText(tmp.getForetagsnamn());
				textLeveransadress.setText(tmp.getFaktura());
				textLevPost.setText(tmp.getFakPostOrt());
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null,
					"Det finns inga kunder med det organisationsnummret");
			textOrgnr.setText(null);
			textForetagsnamn.setText(null);
			textFaktura.setText(null);
			textFakPostOrt.setText(null);
			textKontaktperson.setText(null);
			textMail.setText(null);
			textTelenr.setText(null);
		}

	}

	private void registeranyprodukt() {

		int a = Integer.parseInt(textPris.getText());
		int b = Integer.parseInt(textLagerstatus.getText());
		controller.nyProdukt(textKod.getText(), textNamn.getText(), a,
				textViktAntal.getText(), textProduktGrupp.getText(), b,
				textInfo.getText());

		Produkt p = controller.hittaProdukt(textKod.getText());

		JOptionPane.showMessageDialog(
				this,
				"\nProduktnamn: " + p.getNamn() + "\nProduktkod: " + p.getKod()
						+ "\nPris: " + p.getPris() + "\nVikt/Antal: "
						+ p.getViktAntal() + "\nProduktgrupp: " + p.getGrupp()
						+ "\nLagerstatus: " + p.getLagerstatus()
						+ "\nÖvrig info: " + p.getInfo());
	}

	public void letaOrder() {
		boolean b = false;
		tablemodel = new DefaultTableModel();
		String col[] = { "Namn", "Antal", "Pris/st", "Pris" };
		tablemodel.setColumnIdentifiers(col);

		for (Order tmp : controller.getOrdrar()) {
			if (tmp.getOrdernr().equals(textletaOrder.getText())) {

				for (Orderrad tmpo : tmp.getOrderrader()) {
					b = true;

					String[] row = { tmpo.getProdukt().getNamn(),
							String.valueOf(tmpo.getAntal()),
							String.valueOf(tmpo.getProdukt().getPris()),
							String.valueOf(tmpo.kalktotpris()) };
					tablemodel.addRow(row);
				}
				OrderregisterTabell.setModel(tablemodel);
				double totpris = 0;
				for (Orderrad or2 : tmp.getOrderrader()) {
					totpris += or2.kalktotpris();

					textTotalPris.setText(String.valueOf(totpris));
					textForetagsnamnOrder.setText(tmp.getKund()
							.getForetagsnamn());
					textLeveransOrder.setText(tmp.getKund().getFaktura());
					textLevPostOrtOrder.setText(tmp.getKund().getFakPostOrt());
					txtBestallare.setText(tmp.getBestallare());
				}
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null,
					"Det finns inga ordrar med det ordernummret");
		}
	}

	public void letaProdukt() {

		boolean b = false;

		for (Produkt tmp : controller.getProdukter()) {

			if (tmp.getKod().equals(letaprodukt.getText())) {
				b = true;

				txtProduktnamn.setText(tmp.getNamn());
				txtProduktkod.setText(tmp.getKod());
				txtPris.setText(String.valueOf(tmp.getPris()));
				txtViktAntal.setText(tmp.getViktAntal());
				txtLagerstatus.setText(String.valueOf(tmp.getLagerstatus()));
				txtGrupp.setText(tmp.getGrupp());
				txtInfo.setText(tmp.getInfo());
			}
		}
		if (b == false) {
			JOptionPane.showMessageDialog(null,
					"Det finns inga produkter med den produktkoden");
			txtProduktnamn.setText(null);
			txtProduktkod.setText(null);
			txtPris.setText(null);
			txtViktAntal.setText(null);
			txtLagerstatus.setText(null);
			txtGrupp.setText(null);
			txtInfo.setText(null);
		}

	}
}
