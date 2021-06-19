package com.learning.asset_management.service.serviceImpl;

import com.learning.asset_management.service.AssetService;
import com.learning.asset_management.service.model.Asset;
import org.springframework.stereotype.Service;

@Service
public class AssetServiceImpl implements AssetService {
  @Override
  public Asset getAsset(String assetId) {
    return new Asset("Pliers","PL00001");
  }
}
