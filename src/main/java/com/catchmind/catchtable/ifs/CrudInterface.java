package com.catchmind.catchtable.ifs;

import com.catchmind.catchtable.domain.network.Header;

public interface CrudInterface<Req, Res> {
    Header<Res> create(Header<Req> request);
    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);
    Header<Res> delete(Long id);
}
