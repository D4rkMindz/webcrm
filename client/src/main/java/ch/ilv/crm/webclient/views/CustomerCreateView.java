/**
 * This CustomerCreateView implements a view by using Ginialitys WebApp-Framework.
 */

package ch.ilv.crm.webclient.views;

import com.giniality.education.webappframework.view.AbstractHtmlView;

import webcrm.business.CustomerFactory;
import webcrm.business.ICustomer;

public class CustomerCreateView extends AbstractHtmlView {	
	/**
	 * For informations look at this framework in:
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#createPageContents()
	 * 
	 * @return text The text which is shown on the website
	 */
	public String createPageContents() {
		String text = (String)getDisplayObject();
		return text;
	}

	/**
	 * For informations look at this framework in:
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#getTitle()
	 */
	public String getTitle() {
		return "crm-app";
	}

	/**
	 * For informations look at this framework in:
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#getAliasName()
	 */
	public String getAliasName() {
		return "CreateCustomerView";
	}
}
