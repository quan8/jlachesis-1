package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Duration;

import autils.Logger;
import common.RetResult;
import common.error;

/**
 * TCPStreamLayer implements StreamLayer interface for plain TCP.
 *
 */
class TCPStreamLayer implements StreamLayer {
	InetAddress advertise;
	ServerSocket listener;

	private static Logger logger = Logger.getLogger(TCPStreamLayer.class);

	public TCPStreamLayer(InetAddress advertise, ServerSocket listener) {
		this.advertise = advertise;
		this.listener = listener;
	}

	/**
	 * Dial implements the StreamLayer interface.
	 */
	public RetResult<Socket> Dial(String address, Duration timeout) {
		logger.field("address", address).field("timeout", timeout.toMillis()).debug("Dial");

		Socket socket;
		try {
			logger.debug("Connecting to " + address + " on port " + listener.getLocalPort());
			socket = new Socket(address, listener.getLocalPort());
			logger.debug("Just connected to " + socket.getRemoteSocketAddress());
			//socket.setSoTimeout((int) timeout.toMillis());
		} catch (IOException e) {
			return new RetResult<Socket>(null, error.Errorf(e.getMessage()));
		}

		logger.field("socket", socket).debug("Dial()");
		return new RetResult<Socket>(socket, null);
	}

	/**
	 * Accept implements the net.Listener interface.
	 */
	public RetResult<Socket> Accept() {
		logger.debug("Accept()");
		Socket accept;
		try {
			accept = listener.accept();
			logger.field("accept", accept).debug("Accept()");
		} catch (IOException e) {
			return new RetResult<Socket>(null, error.Errorf(e.getMessage()));
		}
		return new RetResult<Socket>(accept, null);
	}

	// Close implements the net.Listener interface.
	public error Close()  {
		try {
			listener.close();
			return null;
		} catch (IOException e) {
			return error.Errorf(e.getMessage());
		}
	}

	/**
	 * Addr implements the net.Listener interface.
	 */
	public InetAddress Addr() {
		// Use an advertise addr if provided
		if (advertise != null) {
			return advertise;
		}
		return listener.getInetAddress();
	}
}