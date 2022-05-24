package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPOM extends BaseClass{

		 public AdactinPOM(){
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "username")
		private WebElement txtUserName;
		@FindBy(id = "password")
		private WebElement txtPassword;
		@FindBy(id = "login")
		private WebElement btnLogin;
		@FindBy(id = "username_show")
		private WebElement txtUser;
		@FindBy(id = "location")
		private WebElement dropSelect;
		@FindBy(id = "hotels")
		private WebElement dropSelect1;
		@FindBy(id = "room_type")
		private WebElement dropSelect2;
		@FindBy(id = "room_nos")
		private WebElement dropSelect3;
		@FindBy(id = "datepick_in")
		private WebElement txtDateIn;
		@FindBy(id = "datepick_out")
		private WebElement txtDateOut;
		@FindBy(id = "adult_room")
		private WebElement dropSelect4;
		@FindBy(id = "child_room")
		private WebElement dropSelect5;
		@FindBy(id = "Submit")
		private WebElement btnLogin2;
		@FindBy(id = "radiobutton_1")
		private WebElement btnLogin3;
		@FindBy(id = "continue")
		private WebElement btnLogin4;
		@FindBy(id="first_name")
		private WebElement txtDetails;
		@FindBy(id="last_name")
		private WebElement txtDetails2;
		@FindBy(id="address")
		private WebElement txtDetails3;
		@FindBy(id="cc_num")
		private WebElement txtDetails4;
		@FindBy(id = "cc_type")
		private WebElement dropSelect6;
		@FindBy(id = "cc_exp_month")
		private WebElement dropSelect7;
		@FindBy(id = "cc_exp_year")
		private WebElement dropSelect8;
		@FindBy(id = "cc_cvv")
		private WebElement txtDetails5;
		@FindBy(id = "book_now")
		private WebElement btnLogin5;
		@FindBy(id = "order_no")
		private WebElement getText;
		@FindBy(xpath = "//span[@id='checkin_span']")
		private WebElement getError;
		@FindBy(id = "my_itinerary")
		private WebElement getItinerary;
		@FindBy(xpath = "(//input[@name='ids[]'])[1]")
		private WebElement btnCancelSelect;
		@FindBy(xpath = "(//input[@name='cancelall'])")
		private WebElement btnCancel;
		@FindBy(xpath = "//a[text()='Booked Itinerary']")
		private WebElement lnkBooked;
		
		
		public WebElement getTxtUserName() {
			return txtUserName;
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		public WebElement getTxtUser() {
			return txtUser;
		}
		public void setTxtUser(WebElement txtUser) {
			this.txtUser = txtUser;
		}
		public WebElement getTxtDateIn() {
			return txtDateIn;
		}
		public WebElement getTxtDateOut() {
			return txtDateOut;
		}
		public void setTxtDateIn(WebElement txtDateIn) {
			this.txtDateIn = txtDateIn;
		}
		public void setTxtDateOut(WebElement txtDateOut) {
			this.txtDateOut = txtDateOut;
		}
		
		public WebElement getLnkBooked() {
			return lnkBooked;
		}
		public void setLnkBooked(WebElement lnkBooked) {
			this.lnkBooked = lnkBooked;
		}
		public WebElement getGetItinerary() {
			return getItinerary;
		}
		public WebElement getBtnCancelSelect() {
			return btnCancelSelect;
		}
		public WebElement getBtnCancel() {
			return btnCancel;
		}
		public void setGetItinerary(WebElement getItinerary) {
			this.getItinerary = getItinerary;
		}
		public void setBtnCancelSelect(WebElement btnCancelSelect) {
			this.btnCancelSelect = btnCancelSelect;
		}
		public void setBtnCancel(WebElement btnCancel) {
			this.btnCancel = btnCancel;
		}
		public WebElement getGetError() {
			return getError;
		}
		public void setGetError(WebElement getError) {
			this.getError = getError;
		}
		public WebElement getBtnLogin() {
			return btnLogin;
		}
		public WebElement getDropSelect() {
			return dropSelect;
		}
		public WebElement getDropSelect1() {
			return dropSelect1;
		}
		public WebElement getDropSelect2() {
			return dropSelect2;
		}
		public WebElement getDropSelect3() {
			return dropSelect3;
		}
		public WebElement getDropSelect4() {
			return dropSelect4;
		}
		public WebElement getDropSelect5() {
			return dropSelect5;
		}
		public WebElement getBtnLogin2() {
			return btnLogin2;
		}
		public WebElement getBtnLogin3() {
			return btnLogin3;
		}
		public WebElement getBtnLogin4() {
			return btnLogin4;
		}
		public WebElement getTxtDetails() {
			return txtDetails;
		}
		public WebElement getTxtDetails2() {
			return txtDetails2;
		}
		public WebElement getTxtDetails3() {
			return txtDetails3;
		}
		public WebElement getTxtDetails4() {
			return txtDetails4;
		}
		public WebElement getDropSelect6() {
			return dropSelect6;
		}
		public WebElement getDropSelect7() {
			return dropSelect7;
		}
		public WebElement getDropSelect8() {
			return dropSelect8;
		}
		public WebElement getTxtDetails5() {
			return txtDetails5;
		}
		public WebElement getBtnLogin5() {
			return btnLogin5;
		}
		public WebElement getGetText() {
			return getText;
		}
		public void setTxtUserName(WebElement txtUserName) {
			this.txtUserName = txtUserName;
		}
		public void setTxtPassword(WebElement txtPassword) {
			this.txtPassword = txtPassword;
		}
		public void setBtnLogin(WebElement btnLogin) {
			this.btnLogin = btnLogin;
		}
		public void setDropSelect(WebElement dropSelect) {
			this.dropSelect = dropSelect;
		}
		public void setDropSelect1(WebElement dropSelect1) {
			this.dropSelect1 = dropSelect1;
		}
		public void setDropSelect2(WebElement dropSelect2) {
			this.dropSelect2 = dropSelect2;
		}
		public void setDropSelect3(WebElement dropSelect3) {
			this.dropSelect3 = dropSelect3;
		}
		public void setDropSelect4(WebElement dropSelect4) {
			this.dropSelect4 = dropSelect4;
		}
		public void setDropSelect5(WebElement dropSelect5) {
			this.dropSelect5 = dropSelect5;
		}
		public void setBtnLogin2(WebElement btnLogin2) {
			this.btnLogin2 = btnLogin2;
		}
		public void setBtnLogin3(WebElement btnLogin3) {
			this.btnLogin3 = btnLogin3;
		}
		public void setBtnLogin4(WebElement btnLogin4) {
			this.btnLogin4 = btnLogin4;
		}
		public void setTxtDetails(WebElement txtDetails) {
			this.txtDetails = txtDetails;
		}
		public void setTxtDetails2(WebElement txtDetails2) {
			this.txtDetails2 = txtDetails2;
		}
		public void setTxtDetails3(WebElement txtDetails3) {
			this.txtDetails3 = txtDetails3;
		}
		public void setTxtDetails4(WebElement txtDetails4) {
			this.txtDetails4 = txtDetails4;
		}
		public void setDropSelect6(WebElement dropSelect6) {
			this.dropSelect6 = dropSelect6;
		}
		public void setDropSelect7(WebElement dropSelect7) {
			this.dropSelect7 = dropSelect7;
		}
		public void setDropSelect8(WebElement dropSelect8) {
			this.dropSelect8 = dropSelect8;
		}
		public void setTxtDetails5(WebElement txtDetails5) {
			this.txtDetails5 = txtDetails5;
		}
		public void setBtnLogin5(WebElement btnLogin5) {
			this.btnLogin5 = btnLogin5;
		}
		public void setGetText(WebElement getText) {
			this.getText = getText;
		}
		
		
}