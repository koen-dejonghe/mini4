package com.fo.mini4;

public class Gizmo {

	public String name;
	public Object core;
	public GizmoMemory scope;

	public String toString() {
		if (core != null) {
			return core.toString();
		}
		return "nil";
	}

	public Integer integerValue() {
		if (core instanceof Integer) {
			return (Integer) core;
		}
		return null;
	}

	public String stringValue() {
		if (core != null) {
			return core.toString();
		}
		return "nil";
	}

	public Double floatValue() {
		if (core instanceof Double) {
			return (Double) core;
		}
		return null;
	}

	public Boolean booleanValue() {
		if (core instanceof Boolean) {
			return (Boolean) core;
		}

		if (core instanceof Integer) {
			return integerValue() != 0;
		}

		return null;
	}

	public GizmoMemory scopeValue() {
		if (core instanceof GizmoMemory) {
			return (GizmoMemory) core;
		}
		return null;
	}

	public Mini4Parser.FunctionDefContext functionValue() {
		if (core instanceof Mini4Parser.FunctionDefContext) {
			return (Mini4Parser.FunctionDefContext) core;
		}
		return null;
	}

	public Gizmo add(Gizmo operand) {
		Gizmo result = new Gizmo();
		if (core instanceof String) {
			result.core = (String) core + operand.core;
		} else if (operand.core instanceof String) {
			result.core = "" + core + operand.core;
		} else if (core instanceof Integer && operand.core instanceof Integer) {
			result.core = (Integer) core + (Integer) operand.core;
		}
		return result;
	}

	public Gizmo sub(Gizmo operand) {
		Gizmo result = new Gizmo();
		if (core instanceof Integer && operand.core instanceof Integer) {
			result.core = (Integer) core - (Integer) operand.core;
		}
		return result;
	}

	public Gizmo eq(Gizmo operand) {
		boolean eq;
		if (operand == null) {
			eq = this.core == null;
		} else {
			eq = this.core.equals(operand.core);
		}
		Gizmo result = new Gizmo();
		result.core = eq;
		return result;
	}

	public Gizmo ne(Gizmo operand) {
		Gizmo result = eq(operand);
		result.core = ! result.booleanValue();
		return result;
	}

}
