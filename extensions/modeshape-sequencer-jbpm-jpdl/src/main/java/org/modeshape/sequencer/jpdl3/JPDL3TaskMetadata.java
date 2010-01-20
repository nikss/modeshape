/*
 * ModeShape (http://www.modeshape.org)
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * See the AUTHORS.txt file in the distribution for a full listing of 
 * individual contributors. 
 *
 * ModeShape is free software. Unless otherwise indicated, all code in ModeShape
 * is licensed to you under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * ModeShape is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.modeshape.sequencer.jpdl3;

/**
 * This represent a task for a human.
 * 
 * @author Serge Pagop
 */
public class JPDL3TaskMetadata {

    /**
     * The name.
     */
    private String name = "";

    /**
     * The dueDate.
     */
    private String dueDate = "";

    /**
     * The swimlane.
     */
    private String swimlane = "";

    /**
     * @param name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param dueDate
     */
    public void setDueDate( String dueDate ) {
        this.dueDate = dueDate;
    }

    /**
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @return swimlane.
     */
    public String getSwimlane() {
        return this.swimlane;
    }

    /**
     * @param swimlane Sets swimlane to the specified value.
     */
    public void setSwimlane( String swimlane ) {
        this.swimlane = swimlane;
    }

}