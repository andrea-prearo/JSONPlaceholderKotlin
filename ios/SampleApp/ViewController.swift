//
//  ViewController.swift
//  SampleApp
//
//  Created by Andrea Prearo on 7/6/20.
//

import shared
import UIKit

class ViewController: UIViewController {
    private let client = Client()

    override func viewDidLoad() {
        super.viewDidLoad()

        posts()
    }

    // MARK: - Private Methods
    private func posts() {
        client.posts(successCallback: {
            print("Posts = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }

    private func comments() {
        client.comments(successCallback: {
            print("Comments = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }

    private func albums() {
        client.albums(successCallback: {
            print("Albums = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }

    private func photos() {
        client.photos(successCallback: {
            print("Photos = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }

    private func todos() {
        client.todos(successCallback: {
            print("Todos = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }

    private func users() {
        client.users(successCallback: {
            print("Users = \($0)")
        }, errorCallback: {
            print("Error = \($0)")
        })
    }
}
