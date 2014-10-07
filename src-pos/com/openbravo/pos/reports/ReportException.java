//    WandaPos  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2014 uniCenta & previous Openbravo POS works
//    http://www.unicenta.com
//
//    This file is part of WandaPos
//
//    WandaPos is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   WandaPos is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with WandaPos.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.reports;

/**
 *
 * @author JG uniCenta
 */
public class ReportException extends Exception {
    
    /**
     *
     */
    public ReportException() {
    }

    /**
     *
     * @param msg
     */
    public ReportException(String msg) {
        super(msg);
    }

    /**
     *
     * @param e
     */
    public ReportException(Exception e) {
        super(e);
    }
}