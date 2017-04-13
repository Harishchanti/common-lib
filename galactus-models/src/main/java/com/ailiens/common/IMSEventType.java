package com.ailiens.common;

import java.util.ArrayList;
import java.util.List;

/**
 * The IMSEventType enumeration.
 */
public enum IMSEventType {

    OMS_INVENTORY_UPDATE(IMSEventTypeGroup.INVENTORY),
    NICKFURY_INVENTORY_UPDATE(IMSEventTypeGroup.INVENTORY),
    NICKFURY_INVENTORY_RESET(IMSEventTypeGroup.INVENTORY),
    NICKFURY_ARTICAL_PUSH(IMSEventTypeGroup.ARTICAL),
    TRADE_SP_UPDATE_PCM(IMSEventTypeGroup.ARTICAL),
    PCM_STYLE_DELETE_EAN(IMSEventTypeGroup.ARTICAL),
	PCM_STYLE_DELETE_FC(IMSEventTypeGroup.INVENTORY),
	NICKFURY_MRP_CHANGE(IMSEventTypeGroup.ARTICAL);

    private IMSEventTypeGroup group;

	private IMSEventType(IMSEventTypeGroup group) {
		this.group = group;
	}

	public IMSEventTypeGroup getGroup() {
		return group;
	}

	public static List<IMSEventType> getAllType(IMSEventTypeGroup type) {
		List<IMSEventType> types = new ArrayList<>();
		for (IMSEventType typ : IMSEventType.values()) {
			if (typ.getGroup().equals(type)) {
				types.add(typ);
			}
		}
		return types;
	}
}
