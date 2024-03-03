/**
 *     Copyright (C) 2019-2024 Ubiqube.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see https://www.gnu.org/licenses/.
 */
package com.ubiqube.etsi.mano.orchestrator.uow;

import com.ubiqube.etsi.mano.orchestrator.Context3d;
import com.ubiqube.etsi.mano.orchestrator.v4.api.Selector;
import com.ubiqube.etsi.mano.orchestrator.vt.VirtualTaskV3;

public class UnitA implements UnitOfWorkV3<Object> {
	private final NamedTestTask task;

	public UnitA(final Selector selector) {
		this.task = new NamedTestTask(selector);
	}

	@Override
	public String execute(final Context3d context) {
		return null;
	}

	@Override
	public String rollback(final Context3d context) {
		return null;
	}

	@Override
	public VirtualTaskV3<Object> getParameters() {
		return task;
	}

	@Override
	public void setResource(final String res) {
		// TODO Auto-generated method stub

	}

}
