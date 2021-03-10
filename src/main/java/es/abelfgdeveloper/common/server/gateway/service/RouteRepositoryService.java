package es.abelfgdeveloper.common.server.gateway.service;

import es.abelfgdeveloper.common.server.gateway.domain.RouteData;
import java.util.List;

public interface RouteRepositoryService {

  List<RouteData> getRoutes();
}
