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

final class PointLight implements Light {
	public static final float TYPE_POINT_LIGHT = 1.0F;
	public static final int RELATIVE_OFFSET_OF_POINT_LIGHT_DISTANCE_FALLOFF = 5;
	public static final int RELATIVE_OFFSET_OF_POINT_LIGHT_POSITION = 2;
	public static final int SIZE_OF_POINT_LIGHT = 1 + 1 + 3 + 1;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private final float distanceFalloff;
	private final float x;
	private final float y;
	private final float z;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public PointLight(final float x, final float y, final float z, final float distanceFalloff) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.distanceFalloff = distanceFalloff;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public float getType() {
		return TYPE_POINT_LIGHT;
	}
	
	@Override
	public float[] toFloatArray() {
		return new float[] {
			getType(),
			size(),
			this.x,
			this.y,
			this.z,
			this.distanceFalloff
		};
	}
	
	@Override
	public int size() {
		return SIZE_OF_POINT_LIGHT;
	}
}