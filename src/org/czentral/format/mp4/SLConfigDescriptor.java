/*
 * This file is part of the "stream-m" software. An HTML5 compatible live
 * streaming and broadcasting server.
 * Copyright (C) 2014 Varga Bence (vbence@czentral.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.czentral.format.mp4;

import org.czentral.data.binary.annotation.BitField;
import org.czentral.data.binary.annotation.BitTable;

/**
 *
 * @author Varga Bence (vbence@czentral.org)
 */
@BitTable(propOrder = {"predefined"})
public class SLConfigDescriptor extends BaseDescriptor {
    
    private int predefined = 0x02;
    
    public SLConfigDescriptor() {
        super((byte)0x06);
    }
    
    @BitField(bitLength = 8)
    public int getPredefined() {
        return predefined;
    }

    public void setPredefined(int predefined) {
        this.predefined = predefined;
    }
    
}
