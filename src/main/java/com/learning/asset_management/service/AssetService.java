package com.learning.asset_management.service;

import com.learning.asset_management.service.model.Asset;
import org.springframework.stereotype.Service;

public interface AssetService {
 Asset getAsset(String assetId);
}
