package gov.nist.toolkit.xdstools2.client.tabs.actorConfigTab;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.TextBox;
import gov.nist.toolkit.sitemanagement.client.Site;

class DeviceIDCChangedHandler implements ChangeHandler {
	/**
	 *
	 */
	private ActorConfigTab actorConfigTab;
	Site s;
	TextBox textbox;

	DeviceIDCChangedHandler(ActorConfigTab actorConfigTab, Site s, TextBox textbox) {
		this.actorConfigTab = actorConfigTab;
		this.textbox = textbox;
		this.s = s;
	}

	public void onChange(ChangeEvent event) {
		s.xcpd_rcvr_device_id_c = textbox.getText().trim();
		this.actorConfigTab.currentEditSite.changed = true;
	}

}