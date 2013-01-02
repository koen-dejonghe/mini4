package com.fo.mini4;

import java.util.LinkedHashMap;

public class GizmoMemory extends LinkedHashMap<String, Gizmo> {
	private static final long serialVersionUID = 1L;

	public GizmoMemory parentScope;

	public Gizmo put(String name, Gizmo gizmo) {
		gizmo.name = name;
		// insert scope when not done while creating gizmo
		// the latter is done for example when defining the local scope of a
		// function definition
		if (gizmo.scope == null) {
			gizmo.scope = this;
		}
		super.put(name, gizmo);
		return gizmo;
	}

	public Gizmo get(String name) {
		Gizmo gizmo = super.get(name);
		if (gizmo != null) {
			return gizmo;
		}

		if (parentScope != null) {
			gizmo = parentScope.get(name);
		}

		return gizmo;
	}

}
