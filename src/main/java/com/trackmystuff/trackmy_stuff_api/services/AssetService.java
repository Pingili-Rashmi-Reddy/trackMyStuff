package com.trackmystuff.trackmy_stuff_api.services;

import com.trackmystuff.trackmy_stuff_api.models.Asset;
import com.trackmystuff.trackmy_stuff_api.models.User;
import com.trackmystuff.trackmy_stuff_api.repositories.AssetRepository;
import com.trackmystuff.trackmy_stuff_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public Optional<Asset> getAssetById(Long id) {
        return assetRepository.findById(id);
    }

    public Asset createAsset(Asset asset, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
        asset.setUser(user);
        return assetRepository.save(asset);
    }

    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
}