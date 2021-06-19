package com.learning.asset_management.controller;

import com.learning.asset_management.service.AssetService;
import com.learning.asset_management.service.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {

  @Autowired
  AssetService assetService;

  @GetMapping("/asset/{assetid}")
  public Asset getAsset(@PathVariable String assetid) {
    System.out.println("Asset ID in request :: ::"+assetid);
    return assetService.getAsset(assetid);
  }



}
