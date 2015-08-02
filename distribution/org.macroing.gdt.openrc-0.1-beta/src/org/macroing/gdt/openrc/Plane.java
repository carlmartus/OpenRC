/**
 * Copyright 2009 - 2015 J&#246;rgen Lundgren
 * 
 * This file is part of org.macroing.gdt.openrc.
 * 
 * org.macroing.gdt.openrc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * org.macroing.gdt.openrc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.macroing.gdt.openrc. If not, see <http://www.gnu.org/licenses/>.
 */
package org.macroing.gdt.openrc;

final class Plane extends Shape {
	public static final float TYPE_PLANE = 2.0F;
	public static final int RELATIVE_OFFSET_OF_PLANE_SURFACE_NORMAL_VECTOR_IN_SHAPES = 2;
	public static final int SIZE_OF_PLANE_IN_SHAPES = 1 + 1 + 3;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private final float surfaceNormalX;
	private final float surfaceNormalY;
	private final float surfaceNormalZ;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Plane(final float surfaceNormalX, final float surfaceNormalY, final float surfaceNormalZ) {
		this.surfaceNormalX = surfaceNormalX;
		this.surfaceNormalY = surfaceNormalY;
		this.surfaceNormalZ = surfaceNormalZ;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public float getType() {
		return TYPE_PLANE;
	}
	
	@Override
	public float[] toFloatArray() {
		return new float[] {
			getType(),
			size(),
			this.surfaceNormalX,
			this.surfaceNormalY,
			this.surfaceNormalZ
		};
	}
	
	@Override
	public int size() {
		return SIZE_OF_PLANE_IN_SHAPES;
	}
}